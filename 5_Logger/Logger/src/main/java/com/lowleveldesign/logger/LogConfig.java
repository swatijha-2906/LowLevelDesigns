package com.lowleveldesign.logger;

import com.lowleveldesign.logger.category.DebugLogger;
import com.lowleveldesign.logger.category.ErrorLogger;
import com.lowleveldesign.logger.category.InfoLogger;
import com.lowleveldesign.logger.category.MainLogger;
import com.lowleveldesign.logger.sink.*;

public class LogConfig {
    public static MainLogger configLog()
    {
        //add sink for each log
        LogSubject info = new InfoLogSubject();
        LogSubject err= new ErrorLogSubject();
        LogSubject debug= new DebugLogSubject();

        info.add(new ConsoleSink(info));
        err.add(new FileSink(err));
        debug.add(new ConsoleSink(debug));
        debug.add(new DatabaseSink(debug));

        //create chain
        MainLogger mainLogger= new InfoLogger(1, info, new ErrorLogger(2, err,  new DebugLogger(3, debug, null)));

        return mainLogger;
    }

}
