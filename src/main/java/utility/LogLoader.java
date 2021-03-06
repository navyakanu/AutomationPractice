package utility;

import org.apache.log4j.Logger;

/**
 * Created by navyab on 7/3/18.
 */
public class LogLoader {


  public static Logger LoadLog4j() {
        Logger log = Logger.getLogger(LogLoader.class);
         log.info("Starting the test");
         return log;
    }


    public static void info(String message){
      Logger.getLogger(LogLoader.class).info(message);
    }

    public static void debug(String message){
        Logger.getLogger(LogLoader.class).debug(message);
    }

    public static void error(String message){
        Logger.getLogger(LogLoader.class).error(message);
    }


}
