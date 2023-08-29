package algorithm;

import model.Direction;
import model.ElevatorController;
import model.ElevatorSystem;

import java.util.List;

public class ElevatorSelectionStrategy {
    protected List<ElevatorController> elevatorControllerList = ElevatorSystem.INSTANCE.getElevatorControllerList();


    public int selectElevator(int floor, Direction dir) {
        return 0;
    }
}
