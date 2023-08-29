package com.lowleveldesign.logger.sink;

public class ConsoleSink extends LogSink{

    public ConsoleSink(LogSubject logsubject) {
        super(logsubject);
    }

    @Override
    public void log(String msg) {
        System.out.println("Logged in console: " + msg);
    }
}
