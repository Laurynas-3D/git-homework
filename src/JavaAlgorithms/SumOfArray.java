package JavaAlgorithms;

// This program adds up all the elements in the given array.
// Returns the sum of all the values in an array using IntStream
// Revisited at 2020-01

import java.util.stream.IntStream;

public class SumOfArray {

    public static void main(String[] args) {

        int[] testArray = {2, 5, 77, 103, 564, -5, -354, 65, 45, -98, 1050};
        int[] array2 = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87, 58, 13, 98, 74, 36, 24, 72, 91};

        System.out.println("\nThe sum of testArray is: " + sumOfArray(testArray));

        int total2 = IntStream.of(array2).sum();
        System.out.printf("\nTotal of array2 elements: %d%n", total2);

    }

    static int sumOfArray(int[] array){

        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i]; // sum = sum + array[i];
        }
        return sum;
    }
}
