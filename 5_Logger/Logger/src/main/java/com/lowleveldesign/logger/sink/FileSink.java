package com.lowleveldesign.logger.sink;

public class FileSink extends  LogSink{
    public FileSink(LogSubject logsubject) {
        super(logsubject);
    }

    @Override
    public void log(String msg) {
        System.out.println("Logged in file: " + msg);
    }
}
