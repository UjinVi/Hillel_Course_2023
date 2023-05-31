package ua.hilell.Homework07;

public class ColoredLoger {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.setLogLevel(Logger.LogLevel.INFO);

        logger.info("This is an INFO message.");
        logger.debug("This is a DEBUG message.");
        logger.warn("This is a WARNING message.");
        logger.error("This is an ERROR message.");
    }
}
