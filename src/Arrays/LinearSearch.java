package Arrays;
/**
 * This program:
 * - Implements linear search in unsorted array
 *
 * Some Notes:
 * - In an unsorted array, the search operation can be performed by linear traversal
 * from the first element to the last element.
 *
 * Created at 2020-02
 */

public class LinearSearch {

    public static void main(String args[]){
        int array[] = {12, 34, 10, 6, 40, 20, 45, 19, 84, 4, 21};
        int n = array.length;

        // Using a last element as search element
        int key = 84;
        int position = findElement(array, n, key);

        if (position == - 1)
            System.out.println("Element not found");
        else
            System.out.println("Element Found at Position: "
                    + (position + 1));
    }

    // Function to implement search operation
    static int findElement(int arr[], int n, int key){
        for (int i = 0; i < n; i++)
            if (arr[i] == key)
                return i;

        return -1;
    }
}
