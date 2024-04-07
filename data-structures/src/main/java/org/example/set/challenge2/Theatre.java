package org.example.set.challenge2;

import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Theatre {
    private final String name;
    private final int seatsPerRow;
    private final NavigableSet<Seat> seats;

    public Theatre(String name, int seatsPerRow, int totalSeats) {
        if (totalSeats % seatsPerRow != 0 || totalSeats / seatsPerRow > 26) {
            throw new RuntimeException("Invalid input");
        }
        this.name = name;
        this.seatsPerRow = seatsPerRow;
        this.seats = new TreeSet<>();
        int rows = (totalSeats / seatsPerRow) + 65;
        for (int i = 65; i < rows; i++) {
            for (int j = 1; j <= seatsPerRow; j++) {
                seats.add(new Seat((char) i, j));
            }
        }
        assert this.seats.size() == totalSeats;
    }

    public void printSeats() {
        System.out.println("-".repeat(100));
        System.out.println(name.toUpperCase());
        System.out.println("-".repeat(100));
        int i = 0;
        for (Seat seat : seats) {
            System.out.print(seat + " ");
            i++;
            if (i == seatsPerRow) {
                i = 0;
                System.out.println();
            }
        }
        System.out.println("-".repeat(100));
    }

    public Seat reserveSeat(char row, int number) {
        Seat seat = new Seat(row, number);
        for (Seat s : seats) {
            if (s.equals(seat)) {
                if (seat.reserved) {
                    throw new RuntimeException("Seat already reserved");
                }
                s.reserved = true;
                return s;
            }
        }
        throw new RuntimeException("Seat not found!");
    }

    public Set<Seat> reserveSeats(int count, char minRow, int minSeat, int maxSeat) {
        return reserveSeats(count, minRow, minRow, minSeat, maxSeat);
    }

    public Set<Seat> reserveSeats(int count, char minRow, char maxRow, int minSeat, int maxSeat) {
        validate(count, minRow, maxRow, minSeat, maxSeat);

        Set<Seat> selected = null;
        for (char c = minRow; c <= maxRow; c++) {
            NavigableSet<Seat> rowSeats = seats.subSet(new Seat(c, minSeat), true, new Seat(c, maxSeat), true);


            int index = 0;
            Seat first = null;
            for (Seat current : rowSeats) {
                if (current.reserved) {
                    index = 0;
                    first = null;
                    continue;
                }
                index++;
                first = first == null ? current : first;
                if (index == count) { // have got enough contiguous seats
                    selected = seats.subSet(first, true, current, true);
                    break;
                }
            }
            if (selected != null) {
                break;
            }
        }
        if (selected == null) {
            throw new RuntimeException("No match found for given criteria");
        }
        for (Seat seat : selected) {
            seat.reserved = true;
        }
        return new TreeSet<>(selected);
    }

    private void validate(int count, char minRow, char maxRow, int minSeat, int maxSeat) {
        if (count > seatsPerRow) {
            throw new RuntimeException("No row has more than " + seatsPerRow + " seats");
        }
        if (minSeat < 1 || maxSeat > seatsPerRow) {
            throw new RuntimeException("Seat numbers should be between 1 and " + seatsPerRow);
        }
        if (maxSeat - minSeat + 1 < count) {
            throw new RuntimeException("Please expand range to fit requested seats");
        }
        if (minRow > maxRow) {
            throw new RuntimeException("Min row can't be higher than Max row");
        }
        char firstRow = 'A';
        char lastRow = (char) (seats.size() / seatsPerRow + 64);
        if (minRow > maxRow || minRow < firstRow || maxRow > lastRow) {
            throw new RuntimeException("Row should be between " + firstRow + " and " + lastRow);
        }
    }


    public static class Seat implements Comparable<Seat> {
        private final String id;
        private boolean reserved;

        public Seat(char row, int number) {
            this.id = "%s%03d".formatted(row, number);
        }

        @Override
        public int compareTo(Seat o) {
            return this.id.compareTo(o.id);
        }

        @Override
        public String toString() {
            return "%-10s".formatted(id + (reserved ? "(*)" : ""));
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Seat seat = (Seat) o;
            return Objects.equals(id, seat.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }
}
