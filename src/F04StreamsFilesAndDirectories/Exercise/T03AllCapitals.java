import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class T03AllCapitals {
    public static void main(String[] args) {

        String inputPath = "D:\\SoftUni\\SoftUniProjects\\Streams Files and Directories Exercises\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String outputPath = "D:\\SoftUni\\SoftUniProjects\\Streams Files and Directories Exercises\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\outputT03.txt";

        try (BufferedReader reader = Files.newBufferedReader(Path.of(inputPath));
             BufferedWriter writer = Files.newBufferedWriter(Path.of(outputPath))) {
            String line = reader.readLine();
            while (line != null) {
                writer.write(line.toUpperCase());
                writer.write(System.lineSeparator());
                line = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}