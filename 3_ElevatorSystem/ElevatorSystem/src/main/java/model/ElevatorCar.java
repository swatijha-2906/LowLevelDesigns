package model;

import lombok.Getter;
import lombok.Setter;

@Getter
public class ElevatorCar {
    private int id;
    private Door door;
    private Display display;
    private Button button;
    @Setter
    private int currentFloor;  //updated while elevator moves to each floor
    private Direction dir; //updated every time elevator hanges direction


    public ElevatorCar(int id)
    {
        this.id= id;
        door= new Door();
        display= new Display();
        currentFloor= 0;
        dir= Direction.NONE;
        button= new InternalButton();

    }

    public void move(Direction dir, int floor)
    {
        System.out.println("Elevator " + id + "moving " + dir);
        System.out.println("Elevator " + id + "stops at floor " + floor);
        door.open(id);
        door.close(id);

        //called everytime when currFloor value changes
        setDisplay();

    }

    public void pressButton(int floor)
    {
        Direction dir= Direction.NONE;
        if(floor>currentFloor)
            dir= Direction.UP;
        else if(floor<currentFloor)
            dir= Direction.DOWN;
        button.pressButton(floor, dir, id);
    }


    private void setDisplay()
    {
        display.setFloor(currentFloor);
        display.setDir(dir);

    }


}
