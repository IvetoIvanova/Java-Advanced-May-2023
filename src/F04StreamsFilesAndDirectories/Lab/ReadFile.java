import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {

        String path = "D:\\SoftUni\\SoftUniProjects\\Streams Files and Directories Lab\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        FileInputStream inputStream = new FileInputStream(path);

        int currentByte = inputStream.read();
        while (currentByte >= 0) {
            System.out.print(Integer.toBinaryString(currentByte) + " ");
            currentByte = inputStream.read();
        }
        inputStream.close();
    }
}