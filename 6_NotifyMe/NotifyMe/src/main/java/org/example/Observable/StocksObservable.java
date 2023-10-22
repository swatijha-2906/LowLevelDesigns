package org.example.Observable;

import org.example.Observer.UserObserver;

import java.util.ArrayList;
import java.util.List;

public class StocksObservable {

    List<UserObserver> observerList = new ArrayList<>();
    int stockCount = 0;
    String stockName;

    StocksObservable(String name)
    {
        stockName= name;
    }

    public void add(UserObserver ob) {
        observerList.add(ob);
    }

    public void remove(UserObserver ob) {
        observerList.remove(ob);
    }

    public void notifyUsers() {
        for (UserObserver ob : observerList)
            ob.update();
    }

    public void setCount(int count) {

        if (stockCount == 0)
            notifyUsers();
        stockCount = count;
    }

    public String getStockName() {
        return stockName;
    }

}
