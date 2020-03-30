package Library;

import java.security.SecureRandom;

/**
 * This program:
 * - simulates the dice game craps
 *
 * Some Notes:
 * -
 *     GAME RULES:
 *     You roll two dice. Each die has six faces, which contain one, two, three, four, five and six spots, respectively.
 *     After the dice have come to rest, the sum of the spots on the two upward faces is calculated. If the sum is 7 or 11 on
 *     the first throw, you win. If the sum is 2,3, or 12 on the first throw (called "craps"), yu loose (i.e., the "house" wins).
 *     If the sum is 4, 5, 6, 8, 9 or 10 on the first throw, that sum becomes your "point." To win, you must continue rolling
 *     the dice until you "make your point" (i.e., roll that same point 58. Craps class simulates the dice game craps value).
 *     You lose by rolling a 7 before making your point.
 *
 *
 * Created at 2020-03
 */
public class Craps {

    private static final SecureRandom randomNumbers = new SecureRandom();

    private enum Status {CONTINUE, WON, LOST}

    // naming convention on the constance, all capital letters with underscores to separate multiple words
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args){

        int myPoint = 0; // point if win or loss on first roll
        Status gameStatus; // can contain CONTINUE, WON, or LOST

        int sumOfDice = rollDice(); // first roll of the dice

        // determine game status and point based on first roll
        switch (sumOfDice){
            case SEVEN: // win with 7 on first roll
            case YO_LEVEN: // win with 7 on first roll
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES: // lose with 2 on first roll
            case TREY: // lose with 3 on first roll
            case BOX_CARS: // lose with 12 on first roll
                gameStatus = Status.LOST;
                break;
            default: // did not win or lose, so remember point
                gameStatus = Status.CONTINUE; // game is not over
                myPoint = sumOfDice; // remember the point
                System.out.printf("Point is %d%n", myPoint);
                break;
        }

        // while game is not complete
        while (gameStatus == Status.CONTINUE){ // not WON or LOST
            sumOfDice = rollDice(); // roll dice again

            // determine game status
            if (sumOfDice == myPoint)
                gameStatus = Status.WON;
            else
            if (sumOfDice == SEVEN) // loose by rolling 7 before point
                gameStatus = Status.LOST;

            // for any other case we come back to the top of the loop and we try that whole process again
        }

        if (gameStatus == Status.WON)
            System.out.println("Player wins");
        else
            System.out.println("Player loses");


    }

    // roll dice calculate and display results
    public static int rollDice(){
        // pick random dice values
        int die1 = 1 + randomNumbers.nextInt(5);
        int die2 = 1 + randomNumbers.nextInt(6);
        int sum = die1 + die2; // sum of die values
        System.out.printf("Player rolled %d + %d = %d%n",die1,die2,sum);
        return sum;
    }
}
