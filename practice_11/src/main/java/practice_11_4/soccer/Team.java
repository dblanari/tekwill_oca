/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_11_4.soccer;

public class Team {
    private String teamName;
    private Player[] playerArray;
    
    //Constructors
    public Team(String teamName, Player[] players) {
        this(teamName);
        this.playerArray = players;
    }
    public Team(String teamName) {
        this.teamName = teamName;
    }
    
    //Getters and Setters
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Player[] getPlayerArray() {
        return playerArray;
    }
    public void setPlayerArray(Player[] playerArray) {
        this.playerArray = playerArray;
    }
}
