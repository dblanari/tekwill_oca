/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package soccer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Game {
    private Team homeTeam;
    private Team awayTeam;
    private GameEvent[] events;
    private LocalDateTime theDateTime;
    
    //Constructors
    public Game(Team homeTeam, Team awayTeam, LocalDateTime theDateTime) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.theDateTime = theDateTime;
    }
    
    //Methods
    public void playGame() {
        ArrayList <GameEvent> eventList = new ArrayList();
        GameEvent currEvent;
        for (int i = 1; i <=90; i++){
            
            if (Math.random() > 0.95){
                currEvent = Math.random() > 0.6?new Goal():new Possession();
                currEvent.setTheTeam(Math.random() > 0.3?homeTeam: awayTeam);
                currEvent.setThePlayer(currEvent.getTheTeam().
                getPlayerArray()[(int)(Math.random() * currEvent.getTheTeam().getPlayerArray().length)]);
                currEvent.setTheTime(i);
                eventList.add(currEvent);
            }
            this.events = new GameEvent[eventList.size()];
            eventList.toArray(events);
 
        }
    }
    
    public String getDescription() {
        int homeTeamGoals = 0;
        int awayTeamGoals = 0;
        StringBuilder returnString = new StringBuilder();
        
        returnString.append(this.getHomeTeam().getTeamName() + " vs. " +
        this.getAwayTeam().getTeamName() + "\n" + 
               "Date: " + this.getTheDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE) + "\n");
         
        for (GameEvent currEvent: this.getEvents()) {
            if (currEvent instanceof Goal) {
                if (currEvent.getTheTeam()== homeTeam) {
                    homeTeamGoals++;
                    homeTeam.incGoalsTotal(1);
                } 
                else {
                    awayTeamGoals++;
                    awayTeam.incGoalsTotal(1);
                }
            }
            
            returnString.append(currEvent +" after "
            + currEvent.getTheTime() + " mins by "
            + currEvent.getThePlayer().getPlayerName() + " of "
            + currEvent.getTheTeam().getTeamName() +
              "\n");
        }
        
        if (homeTeamGoals == awayTeamGoals) {
            returnString.append("It's a draw!");
            this.homeTeam.incPointsTotal(1);
            this.awayTeam.incPointsTotal(1);
        } 
        else if (homeTeamGoals > awayTeamGoals) {
            returnString.append(homeTeam.getTeamName() + " win");
            this.homeTeam.incPointsTotal(2);
        } 
        else {
            returnString.append(awayTeam.getTeamName() + " win");
            this.awayTeam.incPointsTotal(2);
        }
        returnString.append(" (" + homeTeamGoals + " - " + awayTeamGoals + ") \n");
        
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

    public GameEvent[] getEvents() {
        return events;
    }
    public void setEvents(GameEvent[] events) {
        this.events = events;
    }
    
    public LocalDateTime getTheDateTime() {
        return theDateTime;
    }
    public void setTheDateTime(LocalDateTime theDateTime) {
        this.theDateTime = theDateTime;
    }
}
