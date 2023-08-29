package model;

import lombok.Getter;

import java.util.concurrent.ThreadLocalRandom;

@Getter
public class Dice {
    private int diceCount;

    public Dice(int count)
    {
        diceCount= count;
    }

    public int rollDice()
    {
        int count=0, total=0;
        while(count< diceCount)
        {
            total+= ThreadLocalRandom.current().nextInt(1, 7);
            count++;
        }
        return total;
    }
}
