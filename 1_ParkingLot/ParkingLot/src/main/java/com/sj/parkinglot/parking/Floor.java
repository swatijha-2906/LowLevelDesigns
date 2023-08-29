package com.sj.parkinglot.parking;

import com.sj.parkinglot.vehicle.Vehicle;
import com.sj.parkinglot.vehicle.VehicleType;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Floor
{
    private final String floorId;
    private Map<ParkingSpaceType, List<ParkingSpace>> pSpaces = new HashMap<>();

    public Floor(String floorId)
    {
        this.floorId= floorId;
        pSpaces.put(ParkingSpaceType.BikeParking, new ArrayList<>());
        pSpaces.put(ParkingSpaceType.CarParking, new ArrayList<>());
        pSpaces.put(ParkingSpaceType.TruckParking, new ArrayList<>());

    }

    public void addParkingSpace(ParkingSpace p){
        pSpaces.get(p.getPType()).add(p);
    }
    public void removeParkingSpace(ParkingSpace p){
        pSpaces.get(p.getPType()).remove(p);
    }
    public boolean canParkVehicle(VehicleType vType){
        for(ParkingSpace p: pSpaces.get(getSpaceTypeForVehicle(vType)))
        {
            if(p.isEmpty)
                return true;
        }
        return false;
    }
    private ParkingSpaceType getSpaceTypeForVehicle(VehicleType vType) {
        switch (vType) {
            case CAR:
                return ParkingSpaceType.CarParking;
            case BIKE:
                return ParkingSpaceType.BikeParking;
            case TRUCK:
                return ParkingSpaceType.TruckParking;

        }
        return null;
    }
    public ParkingSpace getSpace(Vehicle v)
    {
        List<ParkingSpace> availableSpaces= new ArrayList<>();
        for(ParkingSpace p: pSpaces.get(getSpaceTypeForVehicle(v.getVType())))
            if(p.isEmpty)
                availableSpaces.add(p);
        return ParkingLot.INSTANCE.getPStrategy().park(availableSpaces);


    }
}
