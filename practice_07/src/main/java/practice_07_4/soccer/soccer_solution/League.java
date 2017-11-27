/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_07_4.soccer.soccer_solution;

public class League {
    public static void main(String[] args) {        
        // Create team1      
        Player player1 = new Player();
        player1.playerName = "George Eliot";
        Player player2 = new Player();
        player2.playerName = "Graham Greene";
        Player player3 = new Player();
        player3.playerName = "Geoffrey Chaucer";
        Player[] thePlayers = {player1, player2, player3 };
        
        Team team1 = new Team();
        team1.teamName = "The Greens";
        team1.playerArray = thePlayers;
        
        // Create team2
        Team team2 = new Team();
        team2.teamName = "The Reds";
        team2.playerArray = new Player[3];
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Robert Service";
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Robbie Burns";
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Rafael Sabatini";

        System.out.println("");
        System.out.println(team1.teamName +":");
        for(Player thePlayer: team1.playerArray){
            System.out.println(thePlayer.playerName);
        }
        System.out.println("");
        System.out.println(team2.teamName +":");
        for(Player thePlayer: team2.playerArray){
            System.out.println(thePlayer.playerName);
        }

        //Create Games and Goals
        Game currGame = new Game();
        currGame.homeTeam = team1;
        currGame.awayTeam = team2;
        
        Goal goal1 = new Goal();
        goal1.thePlayer = currGame.homeTeam.playerArray[2];
        goal1.theTeam = currGame.homeTeam;
        goal1.theTime = 12;
        
        Goal goal2 = new Goal();
        goal2.thePlayer = currGame.homeTeam.playerArray[1];
        goal2.theTeam = currGame.homeTeam;
        goal2.theTime = 23;
        
        Goal goal3 = new Goal();
        goal3.thePlayer = currGame.homeTeam.playerArray[0];
        goal3.theTeam = currGame.awayTeam;
        goal3.theTime = 55;
        
        Goal[] theGoals = {goal1, goal2, goal3};
        currGame.goals = theGoals;
        
        System.out.println("");
        System.out.println("Goals:");
        for(Goal theGoal: currGame.goals){
            System.out.println("Goal scored after " + 
                theGoal.theTime + " mins by " +
                theGoal.thePlayer.playerName + " of " +
                theGoal.theTeam.teamName);
        }
        
        //Search names
        System.out.println("");
        for (Player thePlayer: team2.playerArray) {
            String lastName = thePlayer.playerName.substring(thePlayer.playerName.indexOf(" "), thePlayer.playerName.length());
            if (lastName.matches(".*Sab.*")) {
                System.out.println("Found " + thePlayer.playerName);
            }
        }
        
        //Lastname, Firstname
        StringBuilder familyNameFirst = new StringBuilder();
        for (Player thePlayer: team1.playerArray) {
            String[] name = thePlayer.playerName.split(" ");
            familyNameFirst.append(name[1]);
            familyNameFirst.append(", ");
            familyNameFirst.append(name[0]);
            System.out.println(familyNameFirst);
            familyNameFirst.delete(0,familyNameFirst.length());  
        } 
    }   
}
