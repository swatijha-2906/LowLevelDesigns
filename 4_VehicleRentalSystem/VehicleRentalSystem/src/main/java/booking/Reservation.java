package booking;

import lombok.Getter;
import model.Location;
import model.User;
import model.Vehicle;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
public class Reservation {
    String rID;
    User user;
    Vehicle vehicle;
    LocalDateTime pickupTime;
    LocalDateTime dropTime;
    Location pickupLocation;
    Location dropLocation;
    ReservationStatus status;
    ReservationType reservationType;

    public Reservation(User user, Vehicle vehicle, LocalDateTime pickupTime,
                       Location pickupLocation, LocalDateTime dropTime, Location dropLocation, ReservationType reservationType){
        rID= UUID.randomUUID().toString();
        this.user = user;
        this.vehicle = vehicle;
        this.pickupTime= pickupTime;
        this.pickupLocation = pickupLocation;
        this.dropTime= dropTime;
        this.dropLocation= dropLocation;
        this.status = ReservationStatus.SCHEDULED;

    }

    void setReservationStatus(ReservationStatus status)
    {
        this.status = status;
    }



}
