package com.sj.parkinglot.parking;

import com.sj.parkinglot.vehicle.Vehicle;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
public class EntryGate {
    private String gateId;

    public EntryGate(String gateId){
        this.gateId= gateId;
    }

    public Ticket generateTicket(Vehicle v){
        if(!ParkingLot.INSTANCE.isParkingSpaceAvailable(v.getVType()))
            return null;


        ParkingSpace pSpace= ParkingLot.INSTANCE.findParkingSpace(v);
        pSpace.parkVehicle(v);
        return new Ticket(v, pSpace);
    }
}
