package com.lowleveldesign.logger.sink;

public class DatabaseSink extends LogSink{
    public DatabaseSink(LogSubject logsubject) {
        super(logsubject);
    }

    @Override
    public void log(String msg) {
        System.out.println("Logged in database: " + msg);
    }
}
