/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package soccer;

import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import utility.PlayerDatabase;
import utility.PlayerDatabaseException;

public class League {
    public static void main(String[] args) {    
        League theLeague = new League();

        try{
            Team[] theTeams = theLeague.createTeams("The Robins,The Crows,The Swallows", 20);
            Game[] theGames = theLeague.createGames(theTeams);

            System.out.println(theLeague.getLeagueAnnouncement(theGames));
            for(Game currGame: theGames){
                currGame.playGame();
                System.out.println(currGame.getDescription());
            }
        
            theLeague.showBestTeam(theTeams);
        }
        catch(PlayerDatabaseException e){
            e.printStackTrace();
        }
    }
    
    public Team[] createTeams(String teamNames, int teamSize) throws PlayerDatabaseException {
        PlayerDatabase playerDB = new PlayerDatabase();
        
        StringTokenizer teamNameTokens = new StringTokenizer(teamNames, ",");
        Team[] theTeams = new Team[teamNameTokens.countTokens()];
        for (int i =0; i < theTeams.length; i++){
             theTeams[i] = new Team(teamNameTokens.nextToken(), playerDB.getTeam(teamSize));
        }
        return theTeams;
    }

    public Game[] createGames(Team[] theTeams) {
        int daysBetweenGames = 0;
        ArrayList theGames = new ArrayList();
        
        for (Team homeTeam: theTeams){
            for (Team awayTeam: theTeams){
               if (homeTeam != awayTeam) {
                   daysBetweenGames += 7;
                   theGames.add(new Game(homeTeam, awayTeam, LocalDateTime.now().plusDays(daysBetweenGames)));
               } 
            
            }
        }
        return (Game[]) theGames.toArray(new Game[1]);
    }
    
     public void showBestTeam(Team[] theTeams) {               
        Arrays.sort(theTeams);
        Team currBestTeam = theTeams[0];
        String currBestTeamName = currBestTeam.getTeamName();
        System.out.println("\nTeam Points");       
           
        for (Team currTeam: theTeams){
            System.out.println(currTeam.getTeamName() +" : " +currTeam.getPointsTotal() +" : " +currTeam.getGoalsTotal());
            if (currTeam.getPointsTotal() == currBestTeam.getPointsTotal() && currTeam.getGoalsTotal() == currBestTeam.getGoalsTotal() && theTeams[0].equals(currTeam) == false) {
                currBestTeamName = currBestTeamName +", " +currTeam.getTeamName();
            }
        }
        
        System.out.println("This year's champions are: " +currBestTeamName +"!");     
    }
     
    public String getLeagueAnnouncement(Game[] theGames){
        Period thePeriod = Period.between(theGames[0].getTheDateTime().toLocalDate(), 
        theGames[theGames.length - 1].getTheDateTime().toLocalDate());
        
        return "The league is scheduled to run for " +
        thePeriod.getMonths() + " month(s), and " +
        thePeriod.getDays() + " day(s)\n";
    }
     
}
