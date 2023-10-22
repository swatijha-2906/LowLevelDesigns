package org.example.Observer;

import org.example.Observable.StocksObservable;

public class MessageObserver implements UserObserver {
    String mobileNumber;
    StocksObservable stocksObservable;

    public MessageObserver(String mobile, StocksObservable observable)
    {
        mobileNumber= mobile;
        stocksObservable = observable;
    }

    @Override
    public void update() {
        sendMsg();
    }

    void sendMsg()
    {
        String msg= stocksObservable.getStockName() + " is back in stocks";
        System.out.println("Text message sent to " +  mobileNumber + ": " + msg);
    }
}
