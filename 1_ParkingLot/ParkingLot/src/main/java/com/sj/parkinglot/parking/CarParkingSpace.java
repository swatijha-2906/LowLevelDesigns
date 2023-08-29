package com.sj.parkinglot.parking;

import lombok.Getter;
import lombok.Setter;

public class CarParkingSpace extends ParkingSpace {

    public CarParkingSpace(String spaceId) {
        super(spaceId, ParkingSpaceType.CarParking);
    }
}
