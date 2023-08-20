package ChainOfResponsibility.LoggingLibraryDesign;

public class InfoLogProcessor extends LoggerProcessor {
    InfoLogProcessor(LoggerProcessor loggerProcessor) {
        super(loggerProcessor);
    }

    @Override
    public void log(int level, String msg) {
        if(level == INFO) {
            System.out.println("INFO, " + msg);
        }
        else {
            super.log(level, msg);
        }
    }

}
