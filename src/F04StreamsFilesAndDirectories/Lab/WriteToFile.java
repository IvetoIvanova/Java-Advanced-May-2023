import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        String pathRead = "D:\\SoftUni\\SoftUniProjects\\Streams Files and Directories Lab\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String pathWrite = "D:\\SoftUni\\SoftUniProjects\\Streams Files and Directories Lab\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\outputTask2";

        FileInputStream inputStream = new FileInputStream(pathRead);
        FileOutputStream outputStream = new FileOutputStream(pathWrite);

        int currentByte = inputStream.read();
        while (currentByte >= 0) {
            char currentSymbol = (char) currentByte;
            if (currentSymbol != '.' && currentSymbol != ',' && currentSymbol != '!' && currentSymbol != '?') {
                outputStream.write(currentSymbol);
            }
            currentByte = inputStream.read();
        }

        inputStream.close();
        outputStream.close();
    }
}