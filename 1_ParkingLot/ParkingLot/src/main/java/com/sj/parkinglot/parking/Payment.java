package com.sj.parkinglot.parking;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
public class Payment
{
    private final String paymentId;
    private final LocalDateTime pTime;
    private final double amount;
    private final Ticket ticket;
    private PaymentType pType;
    private final PaymentStrategy pStrategy;

    public Payment(double amount, Ticket ticket, PaymentStrategy pStrategy){
        this.paymentId= UUID.randomUUID().toString();
        this.pTime= LocalDateTime.now();
        this.amount= amount;
        this.pStrategy= pStrategy;
        this.ticket= ticket;


    }
    public void makePayment(PaymentType pType)
    {
        this.pType= pType;
    }

}
