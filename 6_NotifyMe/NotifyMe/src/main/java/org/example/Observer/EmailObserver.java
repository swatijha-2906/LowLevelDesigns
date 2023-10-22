package org.example.Observer;

import org.example.Observable.StocksObservable;

public class EmailObserver implements UserObserver {
    String emailId;
    StocksObservable stocksObservable;

    public EmailObserver(String email, StocksObservable observable)
    {
        emailId= email;
        stocksObservable = observable;
    }

    @Override
    public void update() {
        sendMail();
    }

    void sendMail()
    {
        String msg= stocksObservable.getStockName() + " is back in stocks";
        System.out.println("Mail sent to " +  emailId + ": " + msg);
    }
}
