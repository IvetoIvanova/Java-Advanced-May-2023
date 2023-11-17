import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class SortLines {
    public static void main(String[] args) throws IOException {
        Path pathRead = Paths.get("D:\\SoftUni\\SoftUniProjects\\Streams Files and Directories Lab\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");
        Path pathWrite = Paths.get("D:\\SoftUni\\SoftUniProjects\\Streams Files and Directories Lab\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\writeAllLinesT06");
        List<String> allLines = Files.readAllLines(pathRead);
        Collections.sort(allLines);
        Files.write(pathWrite,allLines);
    }
}
