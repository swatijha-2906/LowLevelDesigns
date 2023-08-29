package com.lowleveldesign.logger.category;

import com.lowleveldesign.logger.sink.LogSubject;

public class InfoLogger extends MainLogger {

    public InfoLogger(int level, LogSubject logSubject, MainLogger nextLogger) {
        super(level, logSubject, nextLogger);

    }



    @Override
    public void display(String msg){
        logSubject.notifyAllObservers("INFO: "+ msg);
    }
}
