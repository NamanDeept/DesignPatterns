package ChainOfResponsibility.LoggingLibraryDesign;

public class ErrorLogProcessor extends LoggerProcessor {

    ErrorLogProcessor(LoggerProcessor logger) {
        super(logger);
    }

    @Override
    public void log(int level, String msg) {
        if(level == ERROR) {
            System.out.println("ERROR, " + msg);
        }
        else {
            super.log(level, msg);
        }
    }

}
