package algorithm;

import lombok.Getter;
import lombok.Setter;
import model.ElevatorController;
import model.ElevatorSystem;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@Getter
public class ElevatorControlStrategy {
    //queue storing pending requests in form of
    @Setter private Queue<PendingRequests> pendingRequestList= new LinkedList<PendingRequests>();
    private List<ElevatorController> elevatorControllerList = ElevatorSystem.INSTANCE.getElevatorControllerList();

    public void moveElevator(ElevatorController elevatorController)
    {

    }
}
