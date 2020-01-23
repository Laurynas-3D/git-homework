package ProblemSolving;

/**
 *  Task: Swap given two numbers and print them. (Try to do it without a temporary variable.)
 *  2020-01
 */

import java.util.Scanner;

public class NumberSwap {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two positive numbers ");
        System.out.print("Enter number 1: ");
        int number1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int number2 = input.nextInt();

        System.out.println("Your entered numbers are: " + number1 + ", " + number2);
        System.out.printf("Swapped numbers are: %d, %d", number2, number1);
    }


}
