package Library;
/**
 This program:
 - Demonstrates StringBuilder methods insert, delete and deleteCharAt

 Some Notes:
 -

 Created at 2020-02
 */

public class StringBuilderInsertDelete {

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

        StringBuilder buffer = new StringBuilder();

        // chained method calls
        buffer.insert(0,objectRef)
                .insert(0,"   ")
                .insert(0,string)
                .insert(0,"   ")
                .insert(0,charArray)
                .insert(0,"   ")
                .insert(0, charArray, 3, 3)
                .insert(0,booleanValue)
                .insert(0,"   ")
                .insert(0, integerValue)
                .insert(0,"   ")
                .insert(0,longValue)
                .insert(0,"   ")
                .insert(0,floatValue)
                .insert(0,"   ")
                .insert(0,doubleValue);

        System.out.printf("buffer after inserts:%n%s%n%n", buffer.toString());

        buffer.deleteCharAt(11); // delete 5 in 2.5
        buffer.delete(2,6); // delete .333 in 33.333

        System.out.printf("buffer after deletes:%n%s%n%n", buffer.toString());

    }

}
