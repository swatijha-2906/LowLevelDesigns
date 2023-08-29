package com.sj.parkinglot.parking;

import lombok.Getter;
import lombok.Setter;

public class TruckParkingSpace extends ParkingSpace{
    public TruckParkingSpace(String spaceId) {
        super(spaceId, ParkingSpaceType.TruckParking);
    }
}
