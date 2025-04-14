import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;


public class replayCmdLog {

    public interface CommandRunner {
        void run(String command);
    }

    public static void replay(String filePath, CommandRunner runner) throws IOException {
        String command;
        File file = new File(filePath);

        if (!file.exists()) {
            throw new IOException("No file found");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file)));
            while ((command = br.readLine()) != null) {
                runner.run(command);
        }

        public static void replay(CommandRunner runner) throws IOException {
            replay("history/cmd_history.txt", runner);
        }


    }
}