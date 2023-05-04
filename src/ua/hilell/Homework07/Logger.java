package ua.hilell.Homework07;


public class Logger {

    public enum LogLevel {
        INFO, DEBUG, WARN, ERROR
    }

    private LogLevel logLevel = LogLevel.INFO;

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }
    public void log(LogLevel level, String message) {
        if (level.ordinal() >= logLevel.ordinal()) {
            String color;
            switch(level) {
                case INFO:
                    color = "\u001B[32m"; // GREEN
                    break;
                case DEBUG:
                    color = "\u001B[36m"; // CYAN
                    break;
                case WARN:
                    color = "\u001B[33m"; // YELLOW
                    break;
                case ERROR:
                    color = "\u001B[31m"; // RED
                    break;
                default:
                    color = "\u001B[0m"; // RESET
                    break;
            }
            System.out.println(color + " [" + level + "] " + message + "\u001B[0m"); // RESET
        }
    }

    public void info(String message) {
        log(LogLevel.INFO, message);
    }

    public void debug(String message) {
        log(LogLevel.DEBUG, message);
    }

    public void warn(String message) {
        log(LogLevel.WARN, message);
    }

    public void error(String message) {
        log(LogLevel.ERROR, message);
    }
}
