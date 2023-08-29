package algorithm;

import lombok.Getter;
import model.Direction;

@Getter
public class PendingRequests {
    private int floor;
    private Direction dir;

    public  PendingRequests(int floor, Direction dir)
    {
        this.floor= floor;
        this.dir= dir;
    }

}
