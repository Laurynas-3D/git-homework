package Library;
/**
 This program:
 - Demonstrates Character class instance methods

 Some Notes:
 -

 Created at 2020-02
 */
public class OtherCharMethods {

    public static void main(String[] args) {

        // NOTE:
        // we creating two character Objects called c1 and c2
        // class Character is being used to create a variable that is initialized as with a primitive char value,
        // this is a literal char value that we are declaring here

        // NOTE:
        // this is technique "Boxing"
        // Java is capable where ever a character object is expected to convert a char primitive type value in to an
        // object or similarly where ever a char primitive type variable or value is expected i can have a character
        // object and Java unpack if you will the char that resides in the object and pass it in the context which is
        // being used, that is called Boxing and Unboxing
        // same technique can be used with any so called type wrapper classes, so every of Javas primitive types, has a
        // corresponding class in the java.lang package for (char) it's Character, for (int) it's Integer, for (long)
        // it's Long, for (float) it's Float, for (double) it's Double, for (boolean) it is Boolean class ect..
        // every single primitive type has a corresponding type wrapper class, and anywhere a primitive value is expected
        // in your code an object of the corresponding type wrapper class can be provided and vice versa as well.

        Character c1 = 'A';
        Character c2 = 'a';

        System.out.printf("c1 = %s%nc2 = %s%n%n", c1.charValue(), c2.toString());

        if (c1.equals(c2))
            System.out.printf("c1 and c2 are equal");
        else
            System.out.printf("c1 and c2 are not equal%n%n");

        // with ternary operator
        char tResult = c1.equals(c2) ? 'A' : 'a';
        System.out.println(tResult);
    }
}
