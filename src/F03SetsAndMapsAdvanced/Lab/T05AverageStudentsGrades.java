package F03SetsAndMapsAdvanced.Lab;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class T05AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        TreeMap<String, ArrayList<Double>> studentGradesMap = new TreeMap<>();

        for (int i = 0; i < numberOfStudents; i++) {
            String input = scanner.nextLine();
            String[] parts = input.split(" ");

            if (parts.length == 2) {
                String studentName = parts[0];
                double grade = Double.parseDouble(parts[1]);

                if (studentGradesMap.containsKey(studentName)) {
                    studentGradesMap.get(studentName).add(grade);
                } else {
                    ArrayList<Double> grades = new ArrayList<>();
                    grades.add(grade);
                    studentGradesMap.put(studentName, grades);
                }
            } else {
                i--;
            }
        }

        for (String studentName : studentGradesMap.keySet()) {
            ArrayList<Double> grades = studentGradesMap.get(studentName);
            double averageGrade = calculateAverage(grades);

            System.out.print(studentName + " -> ");

            for (double grade : grades) {
                System.out.print(String.format("%.2f", grade) + " ");
            }

            System.out.println("(avg: " + String.format("%.2f", averageGrade) + ")");
        }
    }

    private static double calculateAverage(ArrayList<Double> grades) {
        double sum = 0;

        for (double grade : grades) {
            sum += grade;
        }

        return sum / grades.size();
    }
}