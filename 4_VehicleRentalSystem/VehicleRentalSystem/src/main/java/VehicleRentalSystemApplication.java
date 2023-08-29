import booking.Reservation;
import model.*;
import booking.Bill;
import booking.Payment;
import booking.PaymentMode;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystemApplication {
    public static void main(String[] args) {

        //create users
        User user1 = new User(1, "ABCD 20212365435");
        User user2 = new User(2, "EDFE 54324567896");


        //create vehicles
        List<Vehicle> vehicleList1= new ArrayList<>();
        List<Vehicle> vehicleList2= new ArrayList<>();
        Vehicle vehicle1= new Car(1);
        Vehicle vehicle2= new Car(2);
        Vehicle vehicle3= new Bike(3);
        Vehicle vehicle4= new Bike(4);
        vehicleList1.add(vehicle1);
        vehicleList1.add(vehicle2);
        vehicleList2.add(vehicle3);
        vehicleList2. add(vehicle4);

        //create locations
        Location location1 = new Location("Sector 135", "Noida", "UP",
                "India", 201304);

        //create stores
        Store store1= new Store(1, location1, vehicleList1);
        Store store2= new Store(2, location1, vehicleList2);

        //add users and stores in vehicleRentalsystem
        VehicleRentalSystem vehicleRentalSystem = new VehicleRentalSystem();
        vehicleRentalSystem.addUsers(user1);
        vehicleRentalSystem.addUsers(user2);

        vehicleRentalSystem.addStores(store1);
        vehicleRentalSystem.addStores(store2);

        //user1 wants to rent Car in Noida location
        List<Store> allStores= vehicleRentalSystem.findStores(location1);
        //user selects store 1 in the displayed list
        Store store= allStores.get(0);
        List<Vehicle> allVehicles = store.getAllVehicles(VehicleType.CAR);
        //user wants to reserve first car in the displayed list
        Vehicle reservedVehicle = allVehicles.get(0);
        Reservation reservation= allStores.get(0).reserveVehicle(user1, reservedVehicle,
                LocalDateTime.of(2023, Month.JUNE, 29, 05, 30, 00),
                LocalDateTime.of(2023, Month.JUNE, 30, 22, 30, 00),
                location1);

        //Bill is generated
        Bill bill = new Bill(reservation);

        //User does payment
        Payment payment = new Payment();
        payment.makePayment(bill, PaymentMode.UPI);

        //Booking is confirmed
        //user comes to pickup vehicle
        reservedVehicle.setStatus(VehicleStatus.RENTED);

        //user drops the vehicle
        store.completeReservation(reservation);


    }
}
