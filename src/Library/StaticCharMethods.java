package Library;

/**
 This program:
 - Mechanical example of Character static methods for testing characters and converting case

 Some Notes:
 -

 Created at 2020-02
 */

import java.util.Scanner;

public class StaticCharMethods {

    public static void main(String[] args) {

        // NOTE:
        // sometimes when you validating user input, you need to read it as a string and then test individual characters
        // in the string to see if they they meet format you need in your program then perhaps convert that string at
        // that point to the appropriate type

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a character and press Enter");
        String input = scanner.next();
        char c = input.charAt(0);

        // display character info
        System.out.printf("is defined: %b%n", Character.isDefined(c));
        System.out.printf("is digit: %b%n", Character.isDigit(c));
        System.out.printf("is first character in Java identifier: %b%n", Character.isJavaIdentifierStart(c));
        System.out.printf("is part of Java identifier: %b%n", Character.isJavaIdentifierPart(c));
        System.out.printf("is letter: %b%n", Character.isLetter(c));
        System.out.printf("is letter or digit: %b%n", Character.isLetterOrDigit(c));
        System.out.printf("is lower case: %b%n", Character.isLowerCase(c));
        System.out.printf("is upper case: %b%n", Character.isUpperCase(c));
        System.out.printf("to upper case: %s%n", Character.toUpperCase(c));
        System.out.printf("to lower case: %s%n", Character.toLowerCase(c));

    }

}
