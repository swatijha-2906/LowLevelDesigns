package com.sj.parkinglot.vehicle;

import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class Vehicle {
    private String regNum;
    private VehicleType vType;


    public Vehicle(String regNum, VehicleType vType)
    {
        this.regNum= regNum;
        this.vType= vType;
    }

}
