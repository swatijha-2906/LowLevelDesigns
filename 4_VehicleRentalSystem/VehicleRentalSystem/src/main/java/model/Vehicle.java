package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Vehicle {
    int vehicleId;
    int vehicleNo;
    String company;
    String modelName;
    int kmsDriven;
    LocalDateTime manufacturingDate;
    int average;
    int cc;
    int dailyRentalCost;
    int hourlyRentalCost;
    int noOfSeats;
    VehicleStatus status;
    VehicleType type;

    public Vehicle(int vehicleId, VehicleType vehicleType)
    {
        this.vehicleId= vehicleId;
        this.type = vehicleType;
    }



    void updateRentalCost(int dailyRentalCost, int hourlyRentalCost)
    {
        this.dailyRentalCost = dailyRentalCost;
        this.hourlyRentalCost = hourlyRentalCost;

    }

    void setVehicleStatus(VehicleStatus status)
    {
        this.status = status;
    }

    void updateDistanceTravelled(int distance)
    {
        kmsDriven = distance;
    }

}
