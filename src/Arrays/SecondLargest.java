package Arrays;
/**
 This program:
 - Find Second largest element in an array

 Some Notes:
 -

 Created at 2020-02
 */

public class SecondLargest {

    public static void main(String[] args) {
        int array[] = {12, 35, 1, 10, 34, 1};
        int n = array.length;
        print2largest(array, n);
    }

    // Function to print the second largest elements
    public static void print2largest(int arr[], int arr_size) {
        int i, first, second;

        // There should be at least two elements
        if (arr_size < 2) {
            System.out.print(" Invalid Input ");
            return;
        }

        first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr_size; i++) {

            // If current element is smaller than first then update both first and second
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }

            // If arr[i] is in between first and second then update second
            else if (arr[i] > second && arr[i] != first)
                second = arr[i];
        }

        if (second == Integer.MIN_VALUE)
            System.out.print("There is no second largest" + " element\n");
        else
            System.out.print("The second largest element" + " is " + second);
    }

}
