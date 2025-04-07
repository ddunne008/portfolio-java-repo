import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class cmdHistoryFunction {
    private static final File cmdHistory = new File("history/cmd_history.txt");


    public static void saveCmdToLog(String cmd) {
        File folder = new File("history");
        if (!folder.exists()) {
            folder.mkdir();
        }
        try (FileWriter fw = new FileWriter(cmdHistory, true)) {
            fw.write(cmd + "/n");
        } catch (IOException i) {
            System.out.println("Could not log to file");
        }
    }
}
