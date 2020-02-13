package Library;

/**
 This program:
 - simple code shows hot the ternary operator works.

 Some Notes:
 - The Java ternary operator functions like a simplified Java if statement.
 - The ternary operator consists of a condition that evaluates to either true or false

 Created at 2020-02
 */

public class TernaryOperatorTest {

    public static void main(String[] args) {

        int number = 95;

        // .. Usual if() example
        if(number < 100) System.out.println("Less than a hundred");
        else System.out.println("Greater than a hundred");

        // with ternary operator
        String statementToPrint = (number < 100) ? "Less than a hundred" : "Greater than a hundred";
        System.out.println(statementToPrint);

        // The ternary operator consists of a condition that evaluates to either true or false
        String textCase = "uppercase";
        String firstName = textCase.equals("uppercase") ? "LAURYNAS" : "laurynas";
        System.out.println(firstName);

        // Ternary Operator as min Function
        int value1 = 10;
        int value2 = 20;

        int min = value1 <= value2 ? value1 : value2;
        System.out.println("Ternary min - " + min);

        // same effect as the Java Math min() function
        int min2 = Math.min(value1, value2);
        System.out.println("Java Math min() - " + min);

        // Ternary Operator as max Function
        int max = value1 >= value2 ? value1 : value2;
        System.out.println("Ternary max - " + max);

        // Ternary Operator as abs Function; Java Math abs() function does same thing.
        int abs = value1 >= 0 ? value1 : -value1;
        System.out.println("Ternary abs - " + max);

        // Chained Ternary Operators; Try: input = null; | input = ""; | input = "123";
        String input = "123";

        int chValue = input == null ? -1 : input.equals("") ? 0 : Integer.parseInt(input);
        System.out.println("Chained Ternary - " + chValue);

        // NOTE:
        // It is possible to chain more than one Java ternary operator together.
        // You do so by having one of the values returned by the ternary operator be another ternary operator.


    }

}
