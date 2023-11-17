import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class T05LineNumbers {
    public static void main(String[] args) {

        String inputPath = "D:\\SoftUni\\SoftUniProjects\\Streams Files and Directories Exercises\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";
        String outputPath = "D:\\SoftUni\\SoftUniProjects\\Streams Files and Directories Exercises\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\outputLineNumbers.txt";

        try (BufferedReader reader = Files.newBufferedReader(Path.of(inputPath));
             BufferedWriter writer = Files.newBufferedWriter(Path.of(outputPath))) {

            String line = reader.readLine();
            int count = 1;
            while (line != null) {

                writer.write(count + ". " + line);
                writer.write(System.lineSeparator());

                count++;
                line = reader.readLine();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}