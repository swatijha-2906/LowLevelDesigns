package com.sj.parkinglot.parking;

import lombok.Getter;
import lombok.Setter;


public class BikeParkingSpace extends ParkingSpace{

    public BikeParkingSpace(String spaceId) {
        super(spaceId, ParkingSpaceType.BikeParking);
    }


}
