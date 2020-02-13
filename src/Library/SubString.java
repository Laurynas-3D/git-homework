package Library;

/**
 This program:
 - simple code extracts substrings from Strings.

 Some Notes:
 - String class substring methods

 Created at 2020-02
 */

public class SubString {
    public static void main(String[] args) {

        String letters = "abcdefghijklmabcdefghijklm";

        // test substring methods
        // gives you back the remainder of the string objects starting from that index position
        System.out.printf("Substring from index 20 to end is \"%s\"%n", letters.substring(20));

        // first index value is from which to start copying and create a substring, and the second is another index
        // position that indicates one pass the end character, in this case start copying from index 3 and keep copying
        // up to but not including index position 6
        System.out.printf("%s \"%s\"%n", "Substring from index 3 up to, but not including 6 is", letters.substring(3,6));
    }
}
