/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

import java.util.Scanner;

public class DriverLicenceDemo {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        char[] studentAnswers = new char[20];
        DriverExam exam = new DriverExam();
        try {
            System.out.println("Allowed answers are A,B,C,D:");
            System.out.println("Enter your answers one by one:");

            for (int i = 0; i < studentAnswers.length; i++) {
                System.out.printf("%d. ", (i + 1));
                studentAnswers[i] = Character.toUpperCase(reader.next().charAt(0));
                while (!validateAnswer(studentAnswers[i])) {
                    System.out.print("Wrong entry. please Enter again (A,B,C,D)");
                    studentAnswers[i] = Character.toUpperCase(reader.next().charAt(0));
                }
            }

            exam.setStudentAnswers(studentAnswers);
            int totalCorrect = exam.totalCorrect();
            // int incorrect = exam.totalIncorrect();
            String status;
            status = exam.passed() ? "Passed." : "Failed";

            System.out.printf("%s with total correct: %d", status, totalCorrect);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static boolean validateAnswer(char answer) {
        return (answer == 'A' || answer == 'a') ||
                (answer == 'B' || answer == 'b') ||
                (answer == 'C' || answer == 'c') ||
                (answer == 'D' || answer == 'd');
    }

}
