package booking;

import java.util.UUID;

public class Payment {
    String paymentID;
    Bill bill;
    PaymentMode paymentMode;

    public Payment()
    {
        paymentID = UUID.randomUUID().toString();
    }

    public void makePayment(Bill bill, PaymentMode paymentMode)
    {
        this.bill= bill;
        this.paymentMode= paymentMode;
        bill.status= BillStatus.PAID;

        System.out.println("Paid Rs " + bill.amount + " successfully");
        System.out.println("Your Reservation is successful");

    }


}
