package com.lowleveldesign.logger.category;

import com.lowleveldesign.logger.sink.LogSubject;

public abstract class MainLogger {
    int level;
    MainLogger nextLogger;
    LogSubject logSubject;

    //set nextLogger in constructor or create setNextLogger method;
    public MainLogger(int level, LogSubject logSubject,  MainLogger nextLogger)
    {
        this.level= level;
        this.nextLogger= nextLogger;
        this.logSubject= logSubject;
    }

    public void log(int logLevel, String msg)
    {
        if(level == logLevel)
            display(msg);
        else
            nextLogger.log(logLevel, msg);
    }

    public abstract void display(String msg);

}
