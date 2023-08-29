package booking;

import lombok.Getter;

import java.util.UUID;

@Getter
public class Bill {
    String billID;
    Reservation reservation;
    int amount;
    BillStatus status;

    public Bill(Reservation reservation)
    {
        billID = UUID.randomUUID().toString();
        this.reservation = reservation;
        //calculate amount based on pickup and drop time and vehicle rental cost
        // (we can get all these from reservation object)
        amount= 100;
        status = BillStatus.PENDING;

    }
}
