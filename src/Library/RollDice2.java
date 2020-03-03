package Library;
/**
 * This program:
 * - Roll a six-sided die 6,000,000 times using arrays instead of switch
 * - demonstration of external iteration, reimplemented RollDice.java with arrays
 *
 * Some Notes:
 * - refs RollDie2.java
 *
 * Created at 2020-03
 */
import java.security.SecureRandom;

public class RollDice2 {

    public static void main (String[] args){

        SecureRandom randomNumbers = new SecureRandom();

        // NOTE:
        // we are rolling six sided die but we created 7 element array in which we ignore the element zero
        // we are going to use actual die values of 1 through 6 as the index numbers in to the array, so we actually
        // only be looking at element positions 1 through 6 in the 7 element array
        int[] frequency = new int[7]; // array of frequency counters

        // NOTE:
        // roll die 6,000,000 times; use die value as frequency index
        // we loop six million times and for each iteration of the loop we get one random number in range 1 to 6
        // so remember randomNumbers.nextInt is going to produce a value from zero up to but not including the argument value
        // that the bound and because we want values from 1 to 6 since there is from 0 to 5 we add 1 to the result of that
        // to shift the random numbers being produced

        // NOTE:
        // so for whatever that value is on each iteration of the loop we go to corresponding element the frequency array
        // and add 1 to that element
        for(int roll = 1; roll <= 6000000; roll++)
            ++frequency[1 + randomNumbers.nextInt(6)];

        // we display a couple column heads showing you the words Face and Frequency
        System.out.printf("%s%10s%n", "Face","Frequency");

        // NOTE:
        // output each array element's value
        // we walk our way through the frequency arrays elements at indexes 1 up to but not including frequency.length
        // frequency.length here is 7 so we are going to iterate from 1 to 6 incrementing by one each time and we display
        // the Face value and frequency of that face in a column format in which face is displayed right justified field
        // of 4 (%4d) and the frequency is displayed right justified in a field of 10 (%10d)
        for (int face = 1; face < frequency.length; face++)
            System.out.printf("%4d%10d%n", face , frequency[face]);
    }
}
