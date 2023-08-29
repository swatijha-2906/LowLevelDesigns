package model;

import lombok.Getter;
import lombok.Setter;
import model.Snake;
import model.Cell;

import java.util.concurrent.ThreadLocalRandom;
import java.util.random.RandomGenerator;

@Getter
public class Board {
    private int boardSize;
    private int noOfSnake;
    private int noOfLadder;
    @Setter
    private Cell[][] cell= new Cell[1000][1000];

    public Board(int size, int snake, int ladder){
        boardSize= size;
        noOfSnake= snake;
        noOfLadder= ladder;

        initializeBoard();
    }

    private void initializeBoard()
    {
        for(int i=1; i<=boardSize; i++)
        {
            cell[generateRowNo(i)][generateColNo(i)]= new Cell();
        }
        generateSnakes();
        generateLadders();
    }
    private void generateSnakes()
    {
        int snakeCount=0;
        while(snakeCount< noOfSnake)
        {
            int start= ThreadLocalRandom.current().nextInt(2, boardSize);
            int end= ThreadLocalRandom.current().nextInt(2, boardSize);
            if(start<=end)
                continue;
            if(cell[generateRowNo(start)][generateColNo(start)].getSnake()==null)
            {
                cell[generateRowNo(start)][generateColNo(start)].setSnake(new Snake(start, end));
                snakeCount++;
            }

        }
    }
    private void generateLadders()
    {
        int ladderCount=0;
        while(ladderCount< getNoOfLadder())
        {
            int start= ThreadLocalRandom.current().nextInt(2, getBoardSize());
            int end= ThreadLocalRandom.current().nextInt(2, getBoardSize());
            if(start>=end)
                continue;
            if(cell[generateRowNo(start)][generateColNo(start)].getLadder()==null &&
                cell[generateRowNo(start)][generateColNo(start)].getSnake()==null)
            {
                cell[generateRowNo(start)][generateColNo(start)].setLadder(new Ladder(start, end));
                ladderCount++;
            }

        }
    }
    private int generateRowNo(int num)
    {
        int row= (int) (num-1/Math.sqrt(getBoardSize()));
        return row;
    }
    private int generateColNo(int num)
    {
        int col= (int) (num-1%Math.sqrt(getBoardSize()));
        return col;
    }
    public int getFinalPosition(int position)
    {
        int row= generateRowNo(position);
        int col= generateColNo(position);
        int finalPosition= position;
        if(cell[row][col].getSnake()!=null)
        {
            System.out.println("Snake bit at: " + position);
            finalPosition= cell[row][col].getSnake().getEnd();


        }
        else if (cell[row][col].getLadder()!=null)
        {
            System.out.println("Climbed ladder at: " + position);
            finalPosition= cell[row][col].getLadder().getEnd();

        }


        return finalPosition;
    }


}
