package com.lowleveldesign.logger.category;

import com.lowleveldesign.logger.sink.LogSubject;

public class ErrorLogger extends MainLogger {
    public ErrorLogger(int level, LogSubject logSubject, MainLogger nextLogger) {
        super(level, logSubject, nextLogger);

    }

    @Override
    public void display(String msg){

        logSubject.notifyAllObservers("ERROR: "+ msg);
    }
}
