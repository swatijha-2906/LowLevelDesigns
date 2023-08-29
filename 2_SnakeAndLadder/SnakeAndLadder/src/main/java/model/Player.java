package model;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Player {
    private int id;
    private String name;
    @Setter
    private int currentPosition;

    public Player(int id, String name){
        this.id= id;
        this.name= name;
        currentPosition= 1;
    }

}
