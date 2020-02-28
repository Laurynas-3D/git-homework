package Arrays;

/**
 * This program:
 * - Finds largest element in an array
 *
 * Some Notes:
 * -
 *
 * Created at 2020-02
 */
import java.util.*;

public class FindLargest {

    public static void main(String[] args) {

        System.out.println("Largest in given array is (with algorithm) - " + largest());
        System.out.println("Largest in given array is (with library) - " + largestWithLib(array, n));
    }

    static int array[] = {10, 324, 45, 90, 9808};
    static int n = array.length;

    // Method to find maximum in arr[]
    static int largest() {
        int i;

        // Initialize maximum element
        int max = array[0];

        // Traverse array elements from second and compare every element with current max
        for (i = 1; i < array.length; i++)
            if (array[i] > max)
                max = array[i];

        return max;
    }

    // returns maximum in arr[] of size n
    static int largestWithLib(int []arr, int n){
        Arrays.sort(arr);
        return arr[n - 1];
    }

}

