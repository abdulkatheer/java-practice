package org.example.set.challenge2;

public class Main {
    public static void main(String[] args) {
        Theatre t = new Theatre("Ambika", 10, 100);
        t.printSeats();
        t.reserveSeat('A', 1);
        t.reserveSeat('A', 3);

//        t.reserveSeat('B', 11);
        t.reserveSeat('B', 1);

//        t.reserveSeat('M', 1);

        t.printSeats();
        t.reserveSeats(4, 'B', 3, 10);
        t.printSeats();
        t.reserveSeats(6, 'B', 'C', 3, 10);
        t.printSeats();
        t.reserveSeats(4, 'B', 1, 10);
        t.printSeats();
//        t.reserveSeats(4, 'B', 'C', 1, 10);
//        t.printSeats();
        t.reserveSeats(1, 'B', 'C', 1, 10);
        t.printSeats();

//        t.reserveSeats(11, 'A', 'J', 1, 11);
//        t.reserveSeats(10, 'A', 'J', 1, 11);
//        t.reserveSeats(10, 'J', 'A', 1, 10);
//        t.reserveSeats(10, 'A', 'J', 0, 10);
        t.reserveSeats(10, 'D', 'J', 1, 10);
        t.printSeats();

        t.reserveSeats(10, 'I', 'J', 1, 10);
        t.printSeats();

        t.reserveSeats(2, 'I', 'J', 1, 10);
        t.printSeats();

        t.reserveSeats(4, 'I', 'J', 1, 10);
        t.printSeats();

//        t.reserveSeats(5, 'I', 'J', 1, 10);
//        t.printSeats();

        t.reserveSeats(4, 'I', 'J', 1, 10);
        t.printSeats();
    }
}
