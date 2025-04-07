import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class replayCmdLog {
    public static void replay(String filePath, CommandRunner runner) {
        String command;
        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("No file found");
            return;
        }
        BufferedReader br = new BufferedReader(new FileReader(file));
        while ((command = reader.readLine()) != null) {
            runner.run(command);
        }

        public static void replay(CommandRunner runner) {
            replay("history/cmd_history.txt", runner);
        }

        public interface CommandRunner {
            void run(String command);
        }
    }
}