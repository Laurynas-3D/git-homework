package Library;
/**
 This program:
 - String methods replace, toLowerCase, toUpperCase, trim and toCharArray.
 - String methods length, charAt and getChars.

 Some Notes:
 -

 Created at 2020-02 / ref StringMiscellaneous.java; StringMiscellaneous2.java
 */

public class StringManipulations {

    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "GOODBYE";
        String s3 = "    spaces    ";

        System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%n%n", s1, s2, s3);

        // test method replace
        System.out.printf("Replace 'l' with 'L' in s1: %s%n%n", s1.replace('l', 'L'));

        // test toLowerCase and toUpperCase
        System.out.printf("s1.toUpperCase() = %s%n", s1.toUpperCase());
        System.out.printf("s2.toLowerCase() = %s%n%n", s2.toLowerCase());

        // test trim method
        System.out.printf("s3 after trim = \"%s\"%n%n", s3.trim());

        // test toCharArray method
        char[] charArray = s1.toCharArray();
        System.out.print("s1 as a character array = ");

        for (char character : charArray) {
            System.out.print(character);
        }
        System.out.println();

        // ---

        String s4 = "hello there";
        char[] charArray2 = new char[5];

        System.out.printf("s4: %s", s4);

        // test length method
        System.out.printf("\nLength of s4: %d", s4.length());

        // loop through characters in s4 with charAt and display reversed
        System.out.printf("%nThe string reversed is: ");

        for (int count = s4.length() - 1; count >= 0; count--)
            System.out.printf("%c", s4.charAt(count));

        // copy characters from string in to charArray
        s4.getChars(0,5, charArray2,0);
        System.out.printf("%nThe character array is: ");
        for (char character : charArray2)
            System.out.print(character);
        System.out.println();

    }
}
