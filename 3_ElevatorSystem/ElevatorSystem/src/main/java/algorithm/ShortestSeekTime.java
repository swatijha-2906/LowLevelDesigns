package algorithm;

import model.ElevatorController;

public class ShortestSeekTime extends ElevatorControlStrategy {
    public void moveElevator(ElevatorController elevatorController)
    {
        //implemented using min heap which is sorted according to
        //min distance of requested floor from the current floor of elevator

        //this min heap is updated everytime a new request is added in the queue or
        // when elevator moves to another floor

        //Disadvantage: starvation of distant floor when maximum request keeps comes from nearly floors


    }
}
