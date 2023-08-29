package com.sj.parkinglot.parking;

import com.sj.parkinglot.vehicle.Vehicle;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
public class Ticket {
    private final String ticketId;
    private final LocalDateTime entryTime;
    private final Vehicle vehicle;
    private final ParkingSpace pSpaceAssigned;
    @Setter private LocalDateTime exitTime;
    @Setter private boolean isActive;
    @Setter private double charges;

    public Ticket(Vehicle v, ParkingSpace pSpace)
    {
        this.ticketId= UUID.randomUUID().toString();
        this.entryTime= LocalDateTime.now();
        this.isActive= true;
        this.vehicle= v;
        this.pSpaceAssigned= pSpace;
    }


}
