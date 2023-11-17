import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {
        String pathRead = "D:\\SoftUni\\SoftUniProjects\\Streams Files and Directories Lab\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        FileInputStream inputStream = new FileInputStream(pathRead);
        Scanner scanner = new Scanner(inputStream);

        String pathWrite = "D:\\SoftUni\\SoftUniProjects\\Streams Files and Directories Lab\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\outputNumbers.txt";
        FileOutputStream outputStream = new FileOutputStream(pathWrite);
        PrintWriter writer = new PrintWriter(outputStream);

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                writer.println(number);
            }
            scanner.next();
        }
        writer.close();
    }
}
