package chapter3;

import java.util.Scanner;

public class LoanQualifier {

    public static void main(String[] args) {

        int requiredSalary = 30000;
        int requiredYears = 2;

        System.out.println("How much do you earn?:");
        Scanner scanner = new Scanner(System.in);
        double customerSalary = scanner.nextDouble();

        System.out.println("How long have you worked at your current place of employment?");
        double customerWorkYears = scanner.nextDouble();

        if(customerSalary >= requiredSalary) {
            if (customerWorkYears >= requiredYears) {
                System.out.println("You have been approved for a loan!");
            } else {
                System.out.println("Your salary is fine but you need to have worked at your current place of employment for "
                    + requiredYears + " or more years.");
            }
        } else {
            System.out.println("Get a better job you bum! You need to earn at least £" + requiredSalary);
        }
    }
}
