package com.lowleveldesign.logger.sink;

import java.util.ArrayList;
import java.util.List;

public class LogSubject {
    List<LogSink> observers = new ArrayList<>();

    public void add(LogSink logSink) {
        observers.add(logSink);
    }

    public void remove(LogSink logSink) {
        observers.remove(logSink);
    }

    public void notifyAllObservers(String msg) {
        for (LogSink logsink : observers) {
            logsink.log(msg);
        }
    }

}
