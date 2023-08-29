package model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class VehicleInventory {
    List<Vehicle> vehicles= new ArrayList<>();

    public VehicleInventory(List<Vehicle> vehicles)
    {
        this.vehicles= vehicles;
    }

    List<Vehicle> getAvailableVehicles(VehicleType vehicleType)
    {
        //return vehicles whose status is AVAILABLE and VehicleType is vehicletype
        return vehicles;
    }

    void addVehicle(Vehicle vehicle)
    {
        vehicles.add(vehicle);
    }

    void removeVehicle(Vehicle vehicle)
    {
        vehicles.remove(vehicle);
    }



}
