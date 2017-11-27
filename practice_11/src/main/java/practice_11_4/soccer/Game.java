/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_11_4.soccer;

import practice_11_4.utility.GameUtils;

public class Game {
    private Team homeTeam;
    private Team awayTeam;
    private Goal[] goals;
    
    //Constructors
    public Game(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }
    
    public void playGame(int maxGoals) {
        int numberOfGoals = (int)(Math.random() * maxGoals + 1);
        Goal[] theGoals = new Goal[numberOfGoals];
        this.goals = theGoals;
        GameUtils.addGameGoals(this);        
    }
    
    public void playGame() {
        playGame(6);
    }
    
    public String getDescription() {
        StringBuilder returnString = new StringBuilder();
        for (Goal currGoal: this.goals) {
            returnString.append("Goal scored after "
            + currGoal.getTheTime() + " mins by "
            + currGoal.getThePlayer().getPlayerName() + " of "
            + currGoal.getTheTeam().getTeamName() +
              "\n");
        }
        return returnString.toString();
    }
    
    //Getters and Setters
    public Team getHomeTeam() {
        return homeTeam;
    }
    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }
    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Goal[] getGoals() {
        return goals;
    }
    public void setGoals(Goal[] goals) {
        this.goals = goals;
    }
}
