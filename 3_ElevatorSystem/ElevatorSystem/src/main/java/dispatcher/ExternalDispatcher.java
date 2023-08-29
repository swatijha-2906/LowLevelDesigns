package dispatcher;

import model.Direction;
import model.ElevatorController;
import model.ElevatorSystem;

public class ExternalDispatcher {

    public static ExternalDispatcher INSTANCE = new ExternalDispatcher();
    private ExternalDispatcher()
    {

    }

    public  void submitRequest(int floor, Direction dir)
    {
        int elevatorId= ElevatorSystem.elevatorSelectionStrategy.selectElevator(floor, dir);
        System.out.println("Selected elevator " + elevatorId);
        for(ElevatorController eController: ElevatorSystem.INSTANCE.getElevatorControllerList())
        {
            if(eController.getId()== elevatorId)
            {
                eController.acceptRequest(floor, dir);
            }
        }
    }
}
