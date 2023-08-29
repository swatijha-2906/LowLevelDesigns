package model;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public class Game {
    private Queue<Player> players= new ArrayDeque<Player>();
    private Board board;
    private Dice dice;

    public void addPlayers(int id, String name)
    {
        Player player= new Player(id, name);
        players.add(player);
        System.out.println("Player added: "+ name);
    }
    public void setBoard(int size, int snake, int ladder)
    {
        board= new Board(size, snake, ladder);
        System.out.println("Board set of size: "+ size);
        System.out.println("Snakes added:" + snake);
        System.out.println("Ladders added: "+ ladder);
    }
    public void setDice(int count)
    {
        dice= new Dice(count);
        System.out.println("No. of dice used: "+ count);
    }
    public void startGame()
    {
        List<String> winners= new ArrayList<>();
        while(players.size()>2)
        {
            Player player= players.poll();
            System.out.println("Turn: " + player.getName());
            System.out.println(player.getName() + " is at : " + player.getCurrentPosition());
            int move= dice.rollDice();
            System.out.println("Dice shows : " + move);
            int currentPosition= player.getCurrentPosition() + move;
            if(currentPosition>=board.getBoardSize())
            {
                winners.add(player.getName());
                System.out.println(player.getName() + " won");
                continue;
            }
            if(currentPosition< board.getBoardSize())
            {
                int finalPosition = board.getFinalPosition(currentPosition);
                player.setCurrentPosition(finalPosition);
                System.out.println(player.getName() + " moved to : " + finalPosition);
            }
            players.add(player);

        }
        System.out.println("Game Over");
        displayResult(winners);
    }
    private void displayResult(List<String> winners)
    {
        System.out.println("Results:");
        int count=0;
        for(String playerName: winners)
        {
            count++;
            System.out.println("Rank " + count + ": " + playerName);

        }
    }
}
