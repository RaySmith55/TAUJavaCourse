package chapter2;

import java.util.Scanner;

public class CoffeeSentenceCreator {

    public static void main(String[] args) {

        System.out.println("Enter an adjective:");
        Scanner scanner = new Scanner(System.in);
        String adjective = scanner.next();

        System.out.println("Enter the name of a season of the year:");
        String season = scanner.next();

        System.out.println("Enter a number:");
        int cupsOfCoffee = scanner.nextInt();
        scanner.close();

        System.out.println(String.format("On a %s %s day, I drink a minimum of %d cups of coffee", adjective, season, cupsOfCoffee));
    }
}
