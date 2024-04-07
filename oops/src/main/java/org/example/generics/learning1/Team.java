package org.example.generics.learning1;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> {
    private String name;
    private List<T> players = new ArrayList<>();
    private int totalWins;
    private int totalLosses;
    private int totalTies;

    public Team(String name) {
        this.name = name;
    }

    public void addTeamMember(T newPlayer) {
        if (!players.contains(newPlayer)) {
            players.add(newPlayer);
        }
    }

    public void listTeamMembers() {
        System.out.println(name + " Roster:");
        System.out.println(players);
    }

    public int ranking() {
        return (totalLosses * 2) + totalTies + 1;
    }

    public String setScore(int ourScore, int theirScore) {
        String message;
        if (ourScore > theirScore) {
            totalWins++;
            message = "beat";
        } else if (ourScore < theirScore) {
            totalLosses++;
            message = "lost to";
        } else {
            totalTies++;
            message = "tied";
        }
        return message;
    }

    @Override
    public String toString() {
        return name + " (Ranked " + ranking() + ")";
    }
}
