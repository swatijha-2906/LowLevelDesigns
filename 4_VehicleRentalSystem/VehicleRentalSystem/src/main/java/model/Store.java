package model;

import booking.Reservation;
import booking.ReservationStatus;
import booking.ReservationType;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
public class Store {
    int StoreID;
    VehicleInventory vehicleInventory;
    Location location;
    List<Reservation> reservations= new ArrayList<>();

    public Store(int storeID, Location location, List<Vehicle> vehicles)
    {
        this.StoreID= storeID;
        this.location= location;
        vehicleInventory = new VehicleInventory(vehicles);
    }


    public List<Vehicle> getAllVehicles(VehicleType vehicleType)
    {

        return vehicleInventory.getAvailableVehicles(vehicleType);
    }

    public Reservation reserveVehicle(User user, Vehicle vehicle, LocalDateTime pickupTime,
                        LocalDateTime dropTime, Location dropLocation)
    {
        Reservation myReservation = new Reservation(user, vehicle, pickupTime, location, dropTime, dropLocation, ReservationType.DAILY);
        reservations.add(myReservation);

        return myReservation;
    }

    public void completeReservation(Reservation reservation)
    {
        //take out the completed reservation from the list of reservations
        reservations.remove(reservation);
        reservation.getVehicle().setStatus(VehicleStatus.AVAILABLE);
        System.out.println("Vehicle is dropped at store");
    }
}
