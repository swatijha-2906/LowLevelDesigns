package com.sj.parkinglot.parking;

import com.sj.parkinglot.vehicle.Vehicle;

import java.time.temporal.ChronoUnit;

public class HourPaymentStrategy extends PaymentStrategy{
    public HourPaymentStrategy(){
        this.setBikeCharges(10);
        this.setCarCharges(20);
        this.setTruckCharges(30);
    }

    @Override
    public double calculateCost(Ticket ticket) {
        long hours = ChronoUnit.HOURS.between(ticket.getExitTime(), ticket.getEntryTime());
        return hours * getChargeType(ticket.getVehicle());
    }
}
