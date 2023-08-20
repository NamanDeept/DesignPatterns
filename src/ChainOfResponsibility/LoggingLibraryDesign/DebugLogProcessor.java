package ChainOfResponsibility.LoggingLibraryDesign;

public class DebugLogProcessor extends  LoggerProcessor {

    DebugLogProcessor(LoggerProcessor logger) {
        super(logger);
    }

    @Override
    public void log(int level, String msg) {
        if(level == DEBUG) {
            System.out.println("DEBUG, " + msg);
        }
        else {
            super.log(level, msg);
        }
    }

}
