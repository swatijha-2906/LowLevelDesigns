package dispatcher;

import model.Direction;
import model.ElevatorController;
import model.ElevatorSystem;

public class InternalDispatcher {

    public  void submitRequest(int floor, Direction dir, int elevatorId)
    {
        for(ElevatorController eController: ElevatorSystem.INSTANCE.getElevatorControllerList())
        {
            if(eController.getId()== elevatorId)
            {
                eController.acceptRequest(floor, dir);
            }
        }
    }
}
