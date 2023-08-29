package com.sj.parkinglot;

import com.sj.parkinglot.admin.Address;
import com.sj.parkinglot.admin.Admin;
import com.sj.parkinglot.admin.ContactInfo;
import com.sj.parkinglot.parking.*;
import com.sj.parkinglot.vehicle.*;

public class ParkingLotApplication {
    public static void main(String[] args){
        System.out.println("Welcome To Parking Lot");
        ParkingLot parkingLot = ParkingLot.INSTANCE;

        Address address = new Address();
        address.setAddressLine1("Mega Mart Parking Complex");
        address.setCity("Noida");
        address.setState("UttarPradesh");
        address.setCountry("India");
        address.setPinCode("201305");

        parkingLot.setAddress(address);

        //Admin tests
        Admin admin= new Admin();
        //Admin Case 1 - should be able to add parking floor
        Floor f1= new Floor("1");
        admin.addFloor(f1);
        //Admin Case 2 - should be able to add parking floor
        Floor f2= new Floor("2");
        admin.addFloor(f2);
        //Admin Case 3 - should be able to add entrance gate
        EntryGate entry1= new EntryGate("1");
        admin.addEntryGate(entry1);
        //Admin Case 4 - should be able to add entrance gate
        EntryGate entry2= new EntryGate("1");
        admin.addEntryGate(entry2);
        //Admin Case 5 - should be able to add exit gate
        ExitGate exit1= new ExitGate("1");
        admin.addExitGate(exit1);
        //Admin Case 6 - should be able to add parking strategy
        admin.setParkingStrategy(new NaturalOrderParking());
        //Admin Case 7 - should be able to add car parking space
        ParkingSpace carSpot1 = new CarParkingSpace("1");
        admin.addParkingSpace(f1, carSpot1);
        //Admin Case 8 - should be able to add bike parking space
        ParkingSpace bikeSpot1 = new BikeParkingSpace("2");
        admin.addParkingSpace(f1, bikeSpot1);
        //Admin Case 9 - should be able to add car parking space
        ParkingSpace carSpot2 = new CarParkingSpace("3");
        admin.addParkingSpace(f1, carSpot2);

        //Parking Test Cases
        //Test Case 1 - check for availability of parking space for Car - TRUE
        System.out.println(ParkingLot.INSTANCE.isParkingSpaceAvailable(VehicleType.CAR));
        //Test Case 2 - check for availability of parking space for Bike - TRUE
        System.out.println(ParkingLot.INSTANCE.isParkingSpaceAvailable(VehicleType.BIKE));
        //Test Case 3 - check for availability of parking space for Truck - FALSE
        System.out.println(ParkingLot.INSTANCE.isParkingSpaceAvailable(VehicleType.TRUCK));
        //Test Case 4 - Entry Gate
        System.out.println(ParkingLot.INSTANCE.getEntries().size());

        // Test Case 5 - get parking space for bike "KA05MR2311" entering from entry gate entry1
        Vehicle vehicle1 = new BikeVehicle("KA05MR2311");
        Ticket ticket1= entry1.generateTicket(vehicle1);
        System.out.println(null==ticket1);

        //Test Case 6 - Now we should not be able to park bike (only 1 parking space created for bike)
        System.out.println(ParkingLot.INSTANCE.isParkingSpaceAvailable(VehicleType.BIKE));

        //Test Case 7 - make payment for ticket1 (vehicle exists from exit1)
        Payment p1= exit1.makePayment(PaymentType.UPI, new HourPaymentStrategy(), ticket1);
        System.out.println(p1.getAmount());

        //Test Case 8 - Now we should be able to park bike "GHFD3452" entering from entry gate entry2
        Vehicle vehicle2 = new BikeVehicle("GHFD3452");
        Ticket ticket2= entry2.generateTicket(vehicle2);
        System.out.println(null==ticket2);

        //Test Case 9 - check for total parking space created for car
        System.out.println(ParkingLot.INSTANCE.getFloorList()
                .get(0).getPSpaces().get(ParkingSpaceType.CarParking).size());

    }
}
