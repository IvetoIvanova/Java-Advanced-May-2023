import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        File folder = new File("D:\\SoftUni\\SoftUniProjects\\Streams Files and Directories Lab\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        if (folder.exists()) {
            if (folder.isDirectory()) {
                File[] allFiles = folder.listFiles();
                for (File file : allFiles) {
                    if (!file.isDirectory()) {
                        System.out.printf("%s: [%d]%n", file.getName(), file.length());
                    }
                }
            }
        }
    }
}
