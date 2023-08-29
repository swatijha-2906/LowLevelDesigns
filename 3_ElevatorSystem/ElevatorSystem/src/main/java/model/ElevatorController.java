package model;
import algorithm.PendingRequests;
import lombok.Getter;

@Getter
public class ElevatorController {

    private int id;
    private ElevatorCar elevatorCar;




    public ElevatorController(int id)
    {
        this.id= id;
        elevatorCar= new ElevatorCar(id);
    }

    public void acceptRequest(int floor, Direction dir)
    {
        ElevatorSystem.elevatorControlStrategy.getPendingRequestList().add(new PendingRequests(floor, dir));

        controlCar();
    }
    private void controlCar()
    {

        ElevatorSystem.elevatorControlStrategy.moveElevator(this);
        System.out.println("Elevator moving...");
    }


}
