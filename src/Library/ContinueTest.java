package Library;
/**
 * This program:
 * - continue statement terminating an iteration of a for statement
 *
 * Some Notes:
 * -
 *
 * Created at 2020-03
 */
public class ContinueTest {

    public static void main (String[] args){

        int count;

        for (count = 1; count <= 10 ; count++){
            if (count == 5)
                continue; // skip remaining code in loop body if count is 5
            System.out.printf("%d, ", count);
        }
        System.out.printf("%nUsed continue to skip printing 5%n", count);
    }
}

/**
 * NOTE:
 * continue statement in (for) repetition statement says to skip over the rest of the body loop and jump immediately
 * to the increment so you can increment the counter for the next iteration
 *
 * in a (while) or (do while) loop the continue statement says - exit the body of the loop and go directly to the loop
 * continuation condition, so you have to be careful if you using continue statement in a (while) or (do while) loop
 * because you might accidentally jump over the counter control variables increment if in fact you are doing counter
 * control repetition and that could lead to an infinite loop if you are not careful.
 */
