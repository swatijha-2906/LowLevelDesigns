package com.lowleveldesign.logger;

public class Application {
    public static void main(String args[])
    {
       Logger logger= Logger.getInstance();
       logger.log(3, "This is debug log");
       logger.log(1, "This is info log");
       logger.log(2, "This is error log");
    }
}
