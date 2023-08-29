package com.lowleveldesign.logger.sink;

public abstract class LogSink {
    LogSubject logsubject;

    LogSink(LogSubject logsubject)
    {
        this.logsubject= logsubject;
    }
    abstract void log(String msg);
}
