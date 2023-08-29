package com.sj.parkinglot.parking;

import com.sj.parkinglot.vehicle.Vehicle;
import lombok.Getter;

@Getter
public abstract class ParkingSpace
{
    private String spaceId;
    private ParkingSpaceType pType;
    private Vehicle vehicle;
    boolean isEmpty;


    public ParkingSpace(String spaceId, ParkingSpaceType type){
        this.spaceId= spaceId;
        this.pType= type;
        this.isEmpty= true;

    }
    public void parkVehicle(Vehicle v)
    {
        isEmpty= false;
        vehicle= v;
    }
    public void removeVehicle()
    {
        vehicle= null;
        isEmpty= true;
    }
}
