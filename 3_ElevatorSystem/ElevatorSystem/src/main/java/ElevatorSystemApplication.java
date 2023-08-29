import algorithm.LookAlgorithm;
import algorithm.OddEvenStrategy;
import model.Direction;
import model.ElevatorController;
import model.ElevatorSystem;
import model.Floor;

public class ElevatorSystemApplication {
    public static void main(String args[])
    {
        //ElevatorSystem is singleton class
        ElevatorSystem elevatorSystem= ElevatorSystem.INSTANCE;
        elevatorSystem.setElevatorSelectionStrategy(new OddEvenStrategy());
        elevatorSystem.setElevatorControlStrategy(new LookAlgorithm());

        //add Floors
        int totalFloors= 50;
        for(int i=0; i<=totalFloors; i++)
        {
            elevatorSystem.addFloor(new Floor(i));
        }
        System.out.println("No. of floors added " + totalFloors);

        //add elevators
        int totalElevators = 4;
        for(int i=1; i<=totalElevators; i++)
        {
            elevatorSystem.addElevator(new ElevatorController(i));
        }
        System.out.println("No. of elevators added " + totalElevators);

        //Working

        //Request 1
        System.out.println("Person at floor 1 presses UP Button");
        for(Floor floor: ElevatorSystem.INSTANCE.floors)
        {
            if(floor.getId()==1)
                floor.pressButton(Direction.UP);
        }

        //Request 2
        System.out.println("Person at floor 5 presses UP Button");
        for(Floor floor: ElevatorSystem.INSTANCE.floors)
        {
            if(floor.getId()==5)
                floor.pressButton(Direction.UP);
        }

        //Request 3
        System.out.println("Person presses 10 in elevator 2");
        for(ElevatorController elevatorController: ElevatorSystem.INSTANCE.getElevatorControllerList())
        {
            if(elevatorController.getId()==2)
                elevatorController.getElevatorCar().pressButton(10);

        }

        //Request 4
        System.out.println("Person presses 6 in elevator 2");
        for(ElevatorController elevatorController: ElevatorSystem.INSTANCE.getElevatorControllerList())
        {
            if(elevatorController.getId()==2)
                elevatorController.getElevatorCar().pressButton(6);
        }

        //Request 5
        System.out.println("Person at floor 7 presses DOWN Button");
        for(Floor floor: ElevatorSystem.INSTANCE.floors)
        {
            if(floor.getId()==7)
                floor.pressButton(Direction.DOWN);
        }

        //Request 6
        System.out.println("Person presses 1 in elevator 3");
        for(ElevatorController elevatorController: ElevatorSystem.INSTANCE.getElevatorControllerList())
        {
            if(elevatorController.getId()==3)
                elevatorController.getElevatorCar().pressButton(1);
        }

    }
}
