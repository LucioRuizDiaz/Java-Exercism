public class LogLevels {

    public static String message(String logLine) {
        int indexOffset = logLine.indexOf(":");
        String returnString = logLine.substring(indexOffset + 1, logLine.length()).trim();
        return returnString;
    }

    public static String logLevel(String logLine) {
        int indexOffset = logLine.indexOf("[");
        int endIndexOffset = logLine.indexOf("]");
        String returnString = logLine.substring(indexOffset + 1, endIndexOffset).toLowerCase();
        return returnString;
    }

    public static String reformat(String logLine) {

        return LogLevels.message(logLine) + " (" + LogLevels.logLevel(logLine) + ")";
    }
}
