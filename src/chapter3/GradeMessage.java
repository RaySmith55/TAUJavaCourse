package chapter3;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String[] args) {
        System.out.println("Enter your grade:");

        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message;

        switch(grade.toUpperCase()) {
            case "A":
                message = "Top of the class.";
                break;
            case "B":
                message = "Nearly there lad";
                break;
            case "C":
                message = "You can do better son";
                break;
            case "D":
                message = "Sort yourself out buddy for crying out loud.";
                break;
            case "E":
                message = "YOU STUPID LITTLE LAYABOUT!";
                break;
            default:
                message = "Please enter a letter between A-E";
            break;
        }

        System.out.println(message);
    }
}
