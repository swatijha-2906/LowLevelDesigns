package com.sj.parkinglot.parking;

import com.sj.parkinglot.vehicle.Vehicle;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class PaymentStrategy {

    private double bikeCharges;
    private double carCharges;
    private double truckCharges;
    public abstract double calculateCost(Ticket t);
    protected double getChargeType(Vehicle v){
        switch (v.getVType()){
            case CAR :
                return carCharges;
            case BIKE:
                return bikeCharges;
            case TRUCK:
                    return truckCharges;


        }

        return 0;
    }
}
