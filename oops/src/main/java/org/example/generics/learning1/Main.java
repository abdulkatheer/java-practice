package org.example.generics.learning1;

public class Main {
    public static void main(String[] args) {
//        BaseballTeam phillies = new BaseballTeam("Philadelphia Phillies");
//        BaseballTeam astros = new BaseballTeam("Houston Astros");
//
//        scoreResult(phillies, 3, astros, 5);
//
//        var harper = new BaseballPlayer("B Harper", "Right Fielder");
//        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");
//        phillies.addTeamMember(harper);
//        phillies.addTeamMember(marsh);
//        phillies.listTeamMembers();

        testBaseballPlayer();
        testFootballPlayer();
//        testString();
    }

    private static void testBaseballPlayer() {
        Team<BaseballPlayer> phillies = new Team<>("Philadelphia Phillies");
        Team<BaseballPlayer> astros = new Team<>("Houston Astros");

        scoreResult(phillies, 3, astros, 5);

        var harper = new BaseballPlayer("B Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        phillies.listTeamMembers();
    }

    private static void testFootballPlayer() {
        Team<FootballPlayer> phillies1 = new Team<>("Philadelphia Phillies");
        Team<FootballPlayer> astros1 = new Team<>("Houston Astros");

        scoreResult(phillies1, 3, astros1, 5);

        var harper1 = new FootballPlayer("B Harper", "Right Fielder");
        var marsh1 = new FootballPlayer("B Marsh", "Right Fielder");
        phillies1.addTeamMember(harper1);
        phillies1.addTeamMember(marsh1);
        phillies1.listTeamMembers();
    }

//    private static void testString() {
//        Team<String> phillies1 = new Team<>("Philadelphia Phillies");
//        Team<String> astros1 = new Team<>("Houston Astros");
//
//        scoreResult(phillies1, 3, astros1, 5);
//
//        var harper1 = "B Harper";
//        var marsh1 = "B Marsh";
//        phillies1.addTeamMember(harper1);
//        phillies1.addTeamMember(marsh1);
//        phillies1.listTeamMembers();
//    }

    private static void scoreResult(BaseballTeam team1, int team1Score, BaseballTeam team2, int team2Score) {
        String message = team1.setScore(team1Score, team2Score);
        team2.setScore(team2Score, team1Score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    private static void scoreResult(Team team1, int team1Score, Team team2, int team2Score) {
        String message = team1.setScore(team1Score, team2Score);
        team2.setScore(team2Score, team1Score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
