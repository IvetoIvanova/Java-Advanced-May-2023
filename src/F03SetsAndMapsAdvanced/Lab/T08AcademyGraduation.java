package F03SetsAndMapsAdvanced.Lab;

import java.util.Scanner;
import java.util.TreeMap;

public class T08AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        TreeMap<String, Double> studentResults = new TreeMap<>();

        for (int i = 0; i < numberOfStudents; i++) {
            String studentName = scanner.nextLine();
            double totalScores = 0;

            String[] grades = scanner.nextLine().split("\\s+");
            for (String grade : grades) {
                totalScores += Double.parseDouble(grade);
            }

            double averageScore = totalScores / grades.length;
            studentResults.put(studentName, averageScore);
        }

        for (var entry : studentResults.entrySet()) {
            System.out.printf("%s is graduated with %s%n", entry.getKey(), entry.getValue());
        }
    }
}