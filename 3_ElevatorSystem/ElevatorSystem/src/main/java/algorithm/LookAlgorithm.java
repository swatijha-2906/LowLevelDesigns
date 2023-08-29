package algorithm;

import model.ElevatorController;

public class LookAlgorithm extends ElevatorControlStrategy {
    public void moveElevator(ElevatorController elevatorController)
    {
//        In this algorithm, the elevator moves in a specific direction,
//        but instead of going all the way to the end of the building before reversing direction
//        like the SCAN algorithm, it reverses direction as soon as it reaches the last
//        request in the current direction.

//        Implemented using a min heap, a max heap and a queue
//        Min heap: all requests that can be served in UP direction
//        (eg. Requested floor> currFloor, requested UP, elevator moving UP)
//        Max heap: all requests that can be served in DOWN direction (floor < currFloor)
//        (eg. Requested floor< currFloor, requested DOWN, elevator moving DOWN)
//        Queue: all requests that cannot be served in current direction
//        eg. elevator moving up and currFloor is 3, now someone at floor 1 requests up

//        While moving up, all requests from min heap will be taken one by one
//        when min heap is empty, elevator reverses direction and all UP requests from queue
//        will be put in min heap.

//        While moving down, all requests from max heap will be taken one by one
//        when max heap is empty, elevator reverses direction and all DOWN requests from queue
//        will be put in max heap.

//        Advantage:
//        1. not frequent change of floor for every request
//        2. no starvation of requests
//        3. efficient in terms of usage because it moves only the areas of the requested floors.


//        Disadvantage: it does not prioritize requests based on their urgency or importance.

    }
}
