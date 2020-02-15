package Library;

/**
 This program:
 - Demonstrates StringBuilder append methods

 Some Notes:
 -

 Created at 2020-02
 */

public class StringBuilderAppend {

    public static void main(String[] args) {

        Object objectRef = "hello"; // assign string to an Object reference
        String string = "goodbye";
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean booleanValue = true;
        char characterValue = 'Z';
        int integerValue = 7;
        long longValue = 10000000000L; // L suffix indicates long
        float floatValue = 2.5f; // f indicates that 2.5 is a float
        double doubleValue = 33.333; // no suffix, double is default

        StringBuilder lastBuffer = new StringBuilder("last buffer");
        StringBuilder buffer = new StringBuilder();

        // NOTE:
        // If you are going to do lots and lost of concatenation using the (+) operator, every individual (+) operation
        // is going to result in completely new string object, and that is a lot dynamic memory allocation, if you
        // concatenating thousands and thousands and thousands strings in to larger strings, for that context you better
        // of StringBuilder and its append methods , a specially if you have a sense of the size of the final string that
        // you need to allocate, because as we demonstrated previously, you can preallocate the size that you need and
        // that way you keep appending and inserting content in to the StringBuilder without having to worry about that
        // StringBuilder reallocating itself, but even if you do not preallocate that size it is still more efficient to
        // append to append to StringBuilder which one runs out of space, not only adds more space for what you appending
        // in a given operation, but adds additional space beyond that, to support future append or insert operations

        // when you convert in StringBuilder to a string Object for output purposes if you put % signs in the
        // StringBuilder they are converted to percent percent escape sequence (%%\) and percent character gets displayed
        // instead a new line character, if you want new lines to be inserted in to your StringBuilder you need to use
        // back slash (\) to separate lines

        // chained method calls
        buffer.append(objectRef)
                .append("\n")
                .append(string)
                .append("\n")
                .append(charArray)
                .append("\n")
                .append(booleanValue)
                .append("\n")
                .append(characterValue)
                .append("\n")
                .append(integerValue)
                .append("\n")
                .append(longValue)
                .append("\n")
                .append(floatValue)
                .append("\n")
                .append(doubleValue)
                .append("\n")
                .append(doubleValue)
                .append("\n")
                .append(lastBuffer);

        System.out.printf("buffer contains%n%s%n", buffer.toString());
    }
}
