package com.pluralsight;

import java.util.Scanner;

public class HighscoreWins {

    public static void main(String[] args) {

        Scanner gameScore = new Scanner(System.in);

        System.out.println("Enter The Game Score: Home:Visitor|21:9");

        // Get the user's input
        String input = gameScore.nextLine();

        // Split teams and scores
        String[] gamePoints = input.split("\\|");
        String[] teamNames = gamePoints[0].split(":");
        String[] teamScores = gamePoints[1].split(":");

        // Store team names
        String homeTeam = teamNames[0];
        String visitorTeam = teamNames[1];

        // Store scores
        int homeScore = Integer.parseInt(teamScores[0]);
        int awayScore = Integer.parseInt(teamScores[1]);

        // Determine the winner
        if (homeScore > awayScore) {
            System.out.println("Winner: " + teamNames[0]);
        } else if (awayScore > homeScore) {
            System.out.println("Winner: " + teamNames[1]);
        } else {
            System.out.println("The game is a tie!");
        }

        gameScore.close();
    }
}
