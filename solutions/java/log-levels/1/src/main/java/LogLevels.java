public class LogLevels {
    
    public static String message(String logLine) {
            return logLine.split(":")[1].trim();
    }

    public static String logLevel(String logLine) {
      String lg = logLine.split(":")[0];
        return lg.substring(1, lg.length()-1).toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine)+ " (" + logLevel(logLine) + ")";
    }
}
