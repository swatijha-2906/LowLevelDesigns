package com.lowleveldesign.logger;

import com.lowleveldesign.logger.category.MainLogger;

public class Logger {
    private static Logger logger = null;
    private static MainLogger mainLogger;
    private Logger()
    {

    }
    public static Logger getInstance()
    {
        if(logger == null)
        {
            logger= new Logger();
            mainLogger= LogConfig.configLog();

        }

        return logger;
    }

    void log(int logLevel,String msg)
    {
        mainLogger.log(logLevel, msg);
    }


}
