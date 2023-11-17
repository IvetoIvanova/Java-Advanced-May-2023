import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class T07MergeTwoFiles {
    public static void main(String[] args) throws IOException {

        String pathFileOne = "D:\\SoftUni\\SoftUniProjects\\Streams Files and Directories Exercises\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";

        String pathFileTwo = "D:\\SoftUni\\SoftUniProjects\\Streams Files and Directories Exercises\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";

        PrintWriter writer = new PrintWriter("outputMerge.txt");

        List<String> allLinesFileOne = Files.readAllLines(Path.of(pathFileOne)); //всички редове от файл 1
        allLinesFileOne.forEach(line -> writer.println(line));
        List<String> allLinesFileTwo = Files.readAllLines(Path.of(pathFileTwo)); //всички редове от файл 2
        allLinesFileTwo.forEach(line -> writer.println(line));

        writer.close();
    }
}