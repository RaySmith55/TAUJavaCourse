package chapter3;

import java.util.Scanner;

public class QuotaCalculator {

    public static void main(String[] args) {

        int quota = 10;

        System.out.println("How many sales did the employee make this month?:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if(sales >= quota) {
            System.out.println("Well done you reached your quota and earned a bonus £250 this month.");
        } else if (sales >= 1) {
            System.out.println("You need to up your game pal, you were " + (quota - sales) + " off your quota this month. Buck your ideas up.");
        } else if (sales == 0) {
            System.out.println("No sales? You mean you sold nothing this month?!? CLEAR OFF OUT OF MY OFFICE NOW!");
        } else {
            System.out.println("You did something wrong.");
        }
    }
}
