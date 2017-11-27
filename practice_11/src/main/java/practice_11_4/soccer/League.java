/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_11_4.soccer;

public class League {
    public static void main(String[] args) {    
        League theLeague = new League();

        Team[] theTeams = theLeague.createTeams();
        Game[] theGames = theLeague.createGames(theTeams);

        for(Game currGame: theGames){
            currGame.playGame();
            System.out.println(currGame.getDescription());
        }       
    }
    
    public Team[] createTeams() {
        //Create team1
        Player player1 = new Player("George Eliot");
        Player player2 = new Player("Graham Greene");
        Player player3 = new Player("Geoffrey Chaucer");
        Player[] thePlayers = {player1, player2, player3};
        Team team1 = new Team("The Greens", thePlayers);

        // Create team2
        Team team2 = new Team("The Reds");
        team2.setPlayerArray(new Player[3]);
        team2.getPlayerArray()[0] = new Player("Robert Service");
        team2.getPlayerArray()[1] = new Player("Robbie Burns");
        team2.getPlayerArray()[2] = new Player("Rafael Sabatini");

        Team[] theTeams = {team1, team2};
        return theTeams;
    }

    public Game[] createGames(Team[] theTeams) {
        Game Game1 = new Game(theTeams[0], theTeams[1]);
        Game Game2 = new Game(theTeams[1], theTeams[0]);
        Game Game3 = new Game(theTeams[0], theTeams[1]);
        Game Game4 = new Game(theTeams[1], theTeams[0]);
        Game[] theGames = {Game1, Game2, Game3, Game4};
        return theGames;
    }
}
