package Library;

/**
 * This program:
 * - Is mechanical example Prefix increment and postfix increment operators
 *
 * Some Notes:
 * - refs Increment.java
 *
 * Created at 2020-03
 */

public class Increment {

    /** 42.
     *
     */

    public static void main(String[] args){

        int c = 5;

        // demonstrate postfix increment operator
        System.out.printf("c before postincrement: %d%n", c );
        System.out.printf("    postincrementing c: %d%n", c++ );
        System.out.printf(" c after postincrement: %d%n", c );

        System.out.println();

        // demonstrating prefix increment operator

        c = 5;

        System.out.printf("c before preincrement: %d%n", c );
        System.out.printf("    preincrementing c: %d%n", ++c );
        System.out.printf(" c after preincrement: %d%n", c );

    }
}
