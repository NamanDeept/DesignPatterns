package ChainOfResponsibility.LoggingLibraryDesign;

import static ChainOfResponsibility.LoggingLibraryDesign.LoggerProcessor.*;

public class Main {
    public static void main(String[] args) {
        LoggerProcessor processor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        processor.log(INFO, "This is test Log");
        processor.log(ERROR, "This is test Log");
        processor.log(DEBUG, "This is test Log");
    }
}
