import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileReaderUtil {

    public static String readFile(String filePath) throws IOException {
        File file = new File(filePath);

        return Files.readString(file.toPath());
    }
}