package Library;

/**
 * This program:
 * - do while repetition statement
 *
 * Some Notes:
 * -
 *
 * Created at 2020-03
 */

public class DoWhileTest {

    public static void main(String[] args){

        int counter = 1;

        do {
            System.out.printf("%d   ", counter);
            ++counter;
        }
        while (counter <= 10);

        System.out.println();
    }
}
