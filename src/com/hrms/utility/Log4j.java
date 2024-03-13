package com.hrms.utility;
import org.apache.log4j.Logger;

public class Log4j {
	   private static Logger Log = Logger.getLogger(Log4j.class.getName());
	       // Need to create these methods, so that they can be called
	   public static void info(String message) {
	   Log.info(message);

}
}