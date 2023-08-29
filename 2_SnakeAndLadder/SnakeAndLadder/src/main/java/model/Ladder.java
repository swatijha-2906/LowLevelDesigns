package model;

import lombok.Getter;

@Getter
public class Ladder {
    private int start;
    private int end;
    public Ladder(int start, int end)
    {
        this.start = start;
        this.end= end;
    }
}
