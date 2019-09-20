package chapter3;

import java.util.Scanner;

public class ChangeForAPound {

    public static void main(String[] args) {

        System.out.println("It's time to play a game:");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number of 1p pieces:");
        int numberOfPennies = scanner.nextInt();

        System.out.println("Enter a number of 2p pieces:");
        int numberOfTwoPennies = scanner.nextInt();

        System.out.println("Enter a number of 5p pieces:");
        int numberOfFivePennies = scanner.nextInt();

        System.out.println("Enter a number of 10p pieces:");
        int numberOfTenPennies = scanner.nextInt();

        System.out.println("Enter a number of 20p pieces:");
        int numberOfTwentyPennies = scanner.nextInt();

        System.out.println("Enter a number of 50p pieces:");
        int numberOfFiftyPennies = scanner.nextInt();

        int total = 0;

        total = total + (50 * numberOfFiftyPennies) + (20 * numberOfTwentyPennies) + (10 * numberOfTenPennies)
            + (5 * numberOfFivePennies) + (2 * numberOfTwoPennies) + numberOfPennies;

        if (total - 100 == 0) {
            System.out.println("Well done, your result was exactly a pound!");
        } else if (total - 100 > 0) {
            System.out.println("You were over a pound by " + (total - 100) + "p");
        } else if (total - 100 < 0) {
            System.out.println("You were under a pound by " + -(total - 100) + "p");
        }
    }
}
