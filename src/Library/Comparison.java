package Library;
/**
 * This program:
 * - Compare integers using if statement, relational operators and equality operator
 *
 * Some Notes:
 * -
 *
 * Created at 2020-03
 */

import java.util.Scanner;

public class Comparison {
    public static void main(String[] main){
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.println("Enter first integer: ");
        number1 = input.nextInt();

        System.out.println("Enter second integer: ");
        number2 = input.nextInt();

        if (number1 == number2)
            System.out.printf("%d == %d%n", number1, number2);
        if (number1 != number2)
            System.out.printf("%d != %d%n", number1, number2);
        if (number1 < number2)
            System.out.printf("%d < %d%n", number1, number2);
        if (number1 > number2)
            System.out.printf("%d > %d%n", number1, number2);
        if (number1 <= number2)
            System.out.printf("%d <= %d%n", number1, number2);
        if (number1 >= number2)
            System.out.printf("%d >= %d%n", number1, number2);

    }

}
