package com.lowleveldesign.logger.category;

import com.lowleveldesign.logger.sink.LogSubject;

public class DebugLogger extends MainLogger {
    public DebugLogger(int level, LogSubject logSubject, MainLogger nextLogger) {
        super(level, logSubject, nextLogger);

    }

    @Override
    public void display(String msg){
        logSubject.notifyAllObservers("DEBUG: "+ msg);
    }
}
