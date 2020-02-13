package Library;
/**
 This program:
 - Comparing Strings String methods startsWith and endsWith

 Some Notes:
 -

 Created at 2020-02
 */

public class StringStartEnd {

    public static void main(String[] args) {

        String[] strings = {"started", "starting", "ended", "ending"};

        // NOTE:
        // test method startsWith
        // enhanced for loop simply walk through each individual string in that array, and determines whether the string
        // starts with the substring "st", if it does true will be returned and we will print that out
        for(String string : strings){
            if (string.startsWith("st"))
                System.out.printf("\"%s\" starts with \"st\"%n", string);
        }
        System.out.println();

        // test method startsWith starting from position 2 of string
        for (String string : strings){
            if (string.startsWith("art",2))
                System.out.printf("\"%s\" starts with \"art\" at position 2%n", string);
        }

        System.out.println();

        // test method endsWith
        for(String string : strings){
            if (string.endsWith("ed"))
                System.out.printf("\"%s\" ends with \"ed\"%n",string);
        }
    }
}