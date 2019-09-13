package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args) {

        System.out.println("Enter the number of hours the employee worked:");
        Scanner scanner = new Scanner(System.in);
        int hoursWorked = scanner.nextInt();

        System.out.println("Enter the employee's pay rate:");
        double payRate = scanner.nextDouble();
        scanner.close();

        double grossPay = hoursWorked * payRate;

        System.out.println("Gross pay is: £" + grossPay);
    }
}
