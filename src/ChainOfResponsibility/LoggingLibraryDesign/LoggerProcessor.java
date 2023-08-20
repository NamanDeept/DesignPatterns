package ChainOfResponsibility.LoggingLibraryDesign;

import java.util.logging.Logger;

public abstract class LoggerProcessor {
    public static int INFO = 1, ERROR = 2, DEBUG = 3;
    LoggerProcessor nextProcessor;
    LoggerProcessor(LoggerProcessor logger) {
        this.nextProcessor = logger;
    }

    public void log(int level, String message) {
        if(this.nextProcessor != null) {
            nextProcessor.log(level, message);
        }
        else {
            System.out.println("The logger " + level + "implementation has not been done yet");
        }
    }

}
