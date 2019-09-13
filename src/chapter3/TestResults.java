package chapter3;

import java.util.Scanner;

public class TestResults {

    public static void main(String[] args) {

        int gradeAValue = 80;
        int gradeBValue = 70;
        int gradeCValue = 60;
        int gradeDValue = 50;


        System.out.println("Enter your test score:");
        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextDouble();

        char grade;

        if (value < gradeDValue) {
            grade = 'F';
        } else if (value < gradeCValue) {
            grade = 'D';
        } else if (value < gradeBValue) {
            grade = 'C';
        } else if (value < gradeAValue) {
            grade = 'B';
        } else {
            grade = 'A';
        }

        System.out.println("Your grade is " + grade);
    }
}
