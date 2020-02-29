import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

public class LogTxt {
    private static LogTxt instance;
    private static File loggingFile;

    private LogTxt() {
        loggingFile = new File("log.txt");
    }

    public static LogTxt getInstance() {
        if (instance == null) {
            instance = new LogTxt();
        }

        return instance;
    }

    public void log(LEVEL level, String msg) {
        LocalTime logTime = LocalTime.now();
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(loggingFile, true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(logTime + ", " + level + ", " + msg);
        printWriter.flush();
        printWriter.close();
    }
}