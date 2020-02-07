package Arrays;

import java.util.Arrays;
import java.util.Random;

/**
 This program:
 - Shuffles given array

 Created at 2020-02
 */

class ShuffleArray{

    public static void main(String[] args){

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = array.length;
        System.out.println("Array before shuffle " + Arrays.toString(array));
        shuffle(array, n);
    }

    // A Function to generate a random permutation of arr[]
    static void shuffle( int arr[], int n){

        // Creating a object for Random class
        Random r = new Random();

        // Start from the last element and swap one by one. We don't
        // need to run for the first element that's why i > 0
        for (int i = n-1; i > 0; i--) {

            // Pick a random index from 0 to i
            int j = r.nextInt(i+1);

            // Swap arr[i] with the element at random index
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        // Prints the random array
        System.out.println("Array after shuffle  "+ Arrays.toString(arr));
    }



}

