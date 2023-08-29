package algorithm;

import model.Direction;
import model.ElevatorController;

import java.util.concurrent.ThreadLocalRandom;


public class OddEvenStrategy extends ElevatorSelectionStrategy {


    @Override
    public int selectElevator(int floor, Direction dir) {
        for(ElevatorController eController: elevatorControllerList)
        {
            //old elevator for odd floors and even elevators for even floors
            //select elevator which is moving in same direction which is requested or IDLE elevator
//            if(floor%2 == eController.getId()%2)
//            {
//                int currFloor= eController.getElevatorCar().getCurrentFloor();
//                Direction currDir= eController.getElevatorCar().getDir();
//                if(floor>currFloor && currDir==Direction.UP)
//                    return eController.getId();
//                else if(floor<currFloor && currDir==Direction.DOWN)
//                    return eController.getId();
//                else if(currDir==Direction.NONE)
//                    return eController.getId();
//
//            }
        }
        return ThreadLocalRandom.current().nextInt(1, elevatorControllerList.size());
    }
}
