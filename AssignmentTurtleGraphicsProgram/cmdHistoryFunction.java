import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class cmdHistoryFunction {
    private static final String his_dir = "history";
    private static final String fp = his_dir + "/cmd_history.txt";


    public static void saveCmdToLog(String cmd) {
        File folder = new File(his_dir);
        if (!folder.exists()) {
            folder.mkdir();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fp, true))) {
            bw.write(cmd);
            bw.newLine();
        } catch (IOException i) {
            System.out.println("Could not log the command");
        }


    }


}
