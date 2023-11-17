import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class T02SumBytes {
    public static void main(String[] args) {
        String path = "D:\\SoftUni\\SoftUniProjects\\Streams Files and Directories Exercises\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        try (BufferedReader reader = Files.newBufferedReader(Path.of(path))) {
            String line = reader.readLine();
            long sum = 0;
            while (line != null) {
                char[] chars = line.toCharArray();
                for (char c : chars) {
                    sum += c;
                }

                line = reader.readLine();
            }
            System.out.println(sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}