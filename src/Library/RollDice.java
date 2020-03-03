package Library;
/**
 * This program:
 * - Roll a six-sided die 6,000,000 times
 *
 * Some Notes:
 * - refs RollDie.java
 *
 * Created at 2020-03
 */
import java.security.SecureRandom;

public class RollDice {
    public static void main(String[] args){

        SecureRandom randomNumbers = new SecureRandom();

        int frequency1 = 0; // count of 1s rolled
        int frequency2 = 0; // count of 2s rolled
        int frequency3 = 0; // count of 3s rolled
        int frequency4 = 0; // count of 4s rolled
        int frequency5 = 0; // count of 5s rolled
        int frequency6 = 0; // count of 6s rolled

        for (int roll = 1; roll <= 6000000; roll++){
            int face = 1 + randomNumbers.nextInt(6);

            switch (face){
                case 1:
                    ++frequency1;
                    break;
                case 2:
                    ++frequency2;
                    break;
                case 3:
                    ++frequency3;
                    break;
                case 4:
                    ++frequency4;
                    break;
                case 5:
                    ++frequency5;
                    break;
                case 6:
                    ++frequency6;
                    break;
            }
        }

        System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n ",
                "Results are:",
                "1: ", frequency1,
                "2: ", frequency2,
                "3: ", frequency3,
                "4: ", frequency4,
                "5: ", frequency5,
                "6: ", frequency6);

        System.out.println();
        System.out.println("Instructors method to show results: ");
        System.out.println("Face\tFrequency ");
        System.out.printf("1\t\t%d%n2\t\t%d%n3\t\t%d%n4\t\t%d%n5\t\t%d%n6\t\t%d%n",
                frequency1,
                frequency2,
                frequency3,
                frequency4,
                frequency5,
                frequency6);

    }
}
