package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cell {
    private Snake snake;
    private Ladder ladder;

    public Cell(){
        snake= null;
        ladder= null;
    }

}
