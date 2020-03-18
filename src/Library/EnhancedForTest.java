package Library;

/**
 * This program:
 * - Using the enhanced for statement to total integers in an array
 *
 * Some Notes:
 * -
 *
 * Created at 2020-03
 */

public class EnhancedForTest {

    public static void main(String[] args) {
        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;

        // NOTE:
        // add each element's value to total
        // we are saying for each number in the array we want to add that number to the total
        // in the enhanced for statements header you declare a parameter (int number) followed by a colon (:)
        // and then the name of array or collection that you are going to iterate through
        // and the enhanced for statement worries about how to perform that iteration
        // this is a step toward internal iteration when we do not know how the counting is done, it is just being done
        // for us
        // so parameter that you declare has to have the same type as the elements of the array or collection or it has
        // to be consistent with that, meaning you can actually assign each element to a variable of that parameter type
        // it prevents us to have IndexOutOfBounds exception because we do not need to use indexes at all here it is not
        // very parallelizable, if this array is million elements long is is still going to walk one element of a time
        // from the beginning of the array until the end adding all those values to the total so when you get to the
        // lambdas and stream presentation, there is for each method you can use that it parallelizable and that can be
        // used to improve performance programs that use large sets of values
        for (int number : array)
            total += number;

        System.out.printf("Total of array elements: %d%n", total);

    }
}

