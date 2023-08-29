package com.sj.parkinglot.parking;

import com.sj.parkinglot.vehicle.Vehicle;
import lombok.Setter;

import java.util.List;


public class NaturalOrderParking extends ParkingStrategy{

    public ParkingSpace park(List<ParkingSpace> availableSpaces){
        return availableSpaces.get(0);
    }
}
