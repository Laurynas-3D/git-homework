package Library;

/**
 This program:
 - Demonstrates String method concat

 Some Notes:
 -

 Created at 2020-02
 */

public class StringConcatenation {

    public static void main(String[] args) {

        String s1 = "Happy ";
        String s2 = "Birthday";

        System.out.printf("s1 = %s%n2s = %s%n%n", s1, s2);
        System.out.printf("Result of s1.concat(s2) = %s%n", s1.concat(s2));
        System.out.printf("s1 after concatenation = %s%n", s1);

        // NOTE:
        // when you combine string with the (+) operator a new string is created containing contents of both
        // strings and the same thing is with (+=) operator a new string is created and then assigned to the reference
        // on the left side of the (+=) operator replacing what was the reference previously there, when you manipulating
        // string object it is important to know that they are IMMUTABLE, you can not change a string object once its
        // created and any operation appears to change any string objects contents is actually creating entirely new
        // string object in memory.
        // And the same is true when concatenation with the concat method of class string
    }

}
