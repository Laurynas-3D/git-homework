package Library;

/**
 This program:
 - Comparing Strings, String methods equals, equalsIgnoreCase, compareTo and region

 Some Notes:
 -

 Created at 2020-02
 */

public class StringCompare {

    public static void main(String[] args) {

        String s1 = new String("hello"); // s1 is a copy of "hello"
        String s2 = "goodbye";
        String s3 = "Happy Birthday";
        String s4 = "happy birthday";

        System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n%n", s1, s2, s3, s4);

        // test for equality
        if (s1.equals("hello")) // true
            System.out.println("s1 equals \"hello\"");
        else System.out.println("s1 does not equal \"hello\"");

        // test equality with ==
        if (s1 == "hello") // false; they are not the same object
            System.out.println("s1 is the same object as \"hello\"");
        else
            System.out.println("s1 is not the same object as \"hello\"");

        // test for equality (ignore case)
        if (s3.equalsIgnoreCase(s4)) // true
            System.out.printf("%s equals %s with case ignored%n", s3,s4);
        else
            System.out.println("s3 does not equals s4");

        // test compareTo
        // [00:04:30]
        // NOTE:
        // if two strings are equal it returns zero
        // if the first string (s1) is less then the other string (s2) a negative value is returned
        // if the first string (s1) is greater then the other string (s2) a positive value is returned
        //
        // h comes after g it has a higher character
        // code, a larger value underneath the hood in the character set, it means s1 should be greater than s2
        System.out.printf("%ns1.compareTo(s2) is %d", s1.compareTo(s2));
        // reversed call, s2 is less that s1
        System.out.printf("%ns2.compareTo(s1) is %d", s2.compareTo(s1));
        // compared object to itself or other the same values, returns 0
        System.out.printf("%ns1.compareTo(s1) is %d", s1.compareTo(s1));

        // NOTE:
        // s3 contains capital H to start and s4 contains a lowercase s4 h to start, and if you look at the ASCII
        // character set, the capital letters in the unicode character set, the Capital letters have lower values that
        // their corresponding lower case letters and the difference between them is 32 in terms of their character codes
        // and we get negative -32 because capital (H) is considered to be less than lower case (h)
        System.out.printf("%ns3.compareTo(s4) is %d", s3.compareTo(s4));
        // reversed comparison
        System.out.printf("%ns4.compareTo(s3) is %d", s4.compareTo(s3));


        // test regionMatches (case sensitive)
        if (s3.regionMatches(0,s4,0,5))
            System.out.println("First 5 characters of s3 and s4 match");
        else
            System.out.println("First 5 characters of s3 and s4 do not match");

        // test regionMatches (ignore case)
        if (s3.regionMatches(true,0,s4,0,5))
            System.out.println("First 5 characters of s3 and s4 match with case ignored");
        else
            System.out.println("First 5 characters of s3 and s4 do not match");

    }
}
