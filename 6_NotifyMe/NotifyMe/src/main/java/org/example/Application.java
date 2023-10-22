package org.example;

import org.example.Observable.MobileStock;
import org.example.Observable.StocksObservable;
import org.example.Observable.WatchStock;
import org.example.Observer.EmailObserver;
import org.example.Observer.MessageObserver;
import org.example.Observer.UserObserver;

public class Application {
    public static void main(String[] args) {

        //Consider there are three items which are out of stock
        StocksObservable mobile1= new MobileStock("mobile1");
        StocksObservable mobile2= new MobileStock("mobile2");
        StocksObservable watch1= new WatchStock("watch1");

        //Suppose user1 subscribe to get notified for mobile1 over email
        UserObserver user1= new EmailObserver("user1@gmail.com", mobile1);
        mobile1.add(user1);

        //Suppose user2 subscribe to get notified for mobile2 over message
        UserObserver user2= new MessageObserver("9876543210", mobile2);
        mobile2.add(user2);

        //Suppose user3 subscribes to get notified both for mobile2 and watch1 over email
        UserObserver user3= new EmailObserver("user3@gmail.com", mobile2);
        UserObserver user3_= new EmailObserver("user3@gmail.com", watch1);
        mobile2.add(user3);
        watch1.add(user3_);

        //Suppose user4 subscribe to get notified for watch1 both over email and message
        UserObserver user4= new EmailObserver("user4@gmail.com", watch1);
        UserObserver user4_= new MessageObserver("7654678320", watch1);
        watch1.add(user4);
        watch1.add(user4_);


        //Now watch1 is added to stocks
        watch1.setCount(10);
        watch1.setCount(15);    //item is already available in stock so notification is not sent

        //Now mobile1 is added to stocks
        mobile1.setCount(5);
    }
}