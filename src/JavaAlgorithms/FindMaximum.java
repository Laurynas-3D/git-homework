package JavaAlgorithms;
/**
 * This program:
 * - Programmer-declared method maximum with three double parameters
 *
 * Some Notes:
 * - refs MaximumFinder.java
 *
 * Created at 2020-03
 */

import java.util.Scanner;

public class FindMaximum {

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        System.out.print("Enter three floating-point values separated by spaces: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        double result = maximum(number1, number2, number3);
        System.out.println("Maximum is: " + result);
    }

    public static double maximum(double x, double y, double z){
        double maximumValue = x;
        if (y > maximumValue)
            maximumValue = y;
        if (z > maximumValue)
            maximumValue = z;
        return maximumValue;
    }

}
