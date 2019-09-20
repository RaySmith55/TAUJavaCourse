package chapter3;

import java.util.Scanner;

public class LoanQualifierV2 {

    public static void main(String[] args) {

        int requiredSalary = 30000;
        int requiredYears = 2;

        System.out.println("How much do you earn?:");
        Scanner scanner = new Scanner(System.in);
        double customerSalary = scanner.nextDouble();

        System.out.println("How long have you worked at your current place of employment?");
        double customerWorkYears = scanner.nextDouble();

        if (customerSalary >= requiredSalary && customerWorkYears >= requiredYears) {
            System.out.println("You have been approved for a loan!");
        } else {
            System.out.println("You can't have a loan from us you donkey!");
        }
    }
}
