package com.pluralsight;


import java.util.Scanner;


public class HighscoreWins {


    public static void main(String[] args) {

        //Import scanner
        //Initialize scanner
        //Prompt user to input score
        //Declare Home team, away team, scores

        String input = "Home:Visitor|5:1";
        String[] GamePoints = input.split("\\|");

        System.out.println("Enter The Game Score: Home:Visitor|21:9");
        Scanner gameScore = new Scanner(System.in);

        //To go to the next line
        gameScore.nextLine();

        //Get individual teams in their own array
        String[] teamNames = GamePoints[0].split(":");


        //Store the first team in its own variable
        String homeTeam = teamNames[0];
        String visitorTeam = teamNames[1];

        //Get individual team scores
        String[] teamScores = GamePoints[1].split(":");

        //Add variables for scores
        int homeScore = Integer.parseInt(teamScores[0]);
        int awayScore = Integer.parseInt(teamScores[1]);


        //Create if statements
        if (homeScore > awayScore) {
            System.out.println("Winner:" + teamNames[0]);
        } else if (awayScore > homeScore) {
            System.out.println("Winner:" + teamNames[1]);
        }


    }
}
