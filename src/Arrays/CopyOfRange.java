package Arrays;

import java.util.Arrays;

/**
 This mechanical example shows how the java.util.Arrays.copyOfRange() method copies
 the specified range of the specified array into a new array.

 Created at 2020-02
 */

public class CopyOfRange {

    public static void main(String args[]){

        int array1[] = { 12, 13, 14, 15, 16, 17, 18 };

        System.out.println("array \"array1\" is: " + Arrays.toString(array1));

        // to index is within the range
        int[] copy = Arrays.copyOfRange(array1, 2, 6);
        System.out.print("array \"copy\" is:    ");
        for (int i : copy)
            System.out.print(i + "  ");

        System.out.println();
        // to index is out of range
        // It assigns Zero to all the index out of range
        int[] copy1 = Arrays.copyOfRange(array1, 4, array1.length + 3);

        System.out.print("array \"copy1\" is:   ");
        for (int i : copy1)
            System.out.print(i + "  ");

        // It throws IllegalArgumentException
        // int[] copy2 = Arrays.copyOfRange(array1, 5, 3);

        // It throws ArrayIndexOutOfBoundsException
        // int[] copy2 = Arrays.copyOfRange(array1, 10, array1.length + 5);
    }
}
