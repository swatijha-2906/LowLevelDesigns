package model;

import java.time.LocalDateTime;

public class Bike extends Vehicle {

    public Bike(int vehicleId) {
        super(vehicleId, VehicleType.BIKE);
    }
}
