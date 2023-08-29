package com.sj.parkinglot.parking;

import com.sj.parkinglot.vehicle.Vehicle;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;


public class DayPaymentStrategy extends PaymentStrategy{

    public DayPaymentStrategy(){
        this.setBikeCharges(100);
        this.setCarCharges(200);
        this.setTruckCharges(300);
    }

    @Override
    public double calculateCost(Ticket ticket) {

        long days = ChronoUnit.DAYS.between(ticket.getExitTime(), ticket.getEntryTime());
        return days * getChargeType(ticket.getVehicle());
    }
}
