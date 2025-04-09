import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class cmdHistoryFunction {
    private static final String HISTORY_DIRECTORY = "history";
    private static final String FILE_PATH = HISTORY_DIRECTORY + "/cmd_history.txt";


    public static void saveCmdToLog(String cmd) {
        File folder = new File(HISTORY_DIRECTORY);
        if (!folder.exists()) {
            folder.mkdir();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            bw.write(cmd);
            bw.newLine();
        } catch (IOException i) {
            System.out.println("Could not log the command");
        }


    }


}
