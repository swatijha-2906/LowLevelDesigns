package com.sj.parkinglot.admin;

import com.sj.parkinglot.parking.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Getter
@Setter
public class Admin {
        private final String id;
        private LoginInfo login;
        private ContactInfo contact;

        public Admin()
        {
            id= UUID.randomUUID().toString();

        }


        public void setParkingStrategy(ParkingStrategy pStrategy){
            ParkingLot.INSTANCE.setPStrategy(pStrategy);
        }
        public void addFloor(Floor f)
        {

            ParkingLot.INSTANCE.getFloorList().add(f);

        }
        public void addParkingSpace(Floor f, ParkingSpace p)
        {

            f.addParkingSpace(p);


        }
        public void addEntryGate(EntryGate entry)
        {
            ParkingLot.INSTANCE.getEntries().add(entry);
        }
        public void addExitGate(ExitGate exit)
        {
            ParkingLot.INSTANCE.getExits().add(exit);
        }

}
