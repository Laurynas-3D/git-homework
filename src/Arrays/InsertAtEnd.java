package Arrays;
/**
 * This program:
 * - Implements insert operation in an unsorted array.
 *
 * Some Notes:
 * -
 *
 * Created at 2020-02
 */

public class InsertAtEnd {

    public static void main (String[] args){

        int[] arr = new int[20];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;
        arr[6] = 80;
        int capacity = 20;
        int n = 7;
        int i, key = 155;

        System.out.print("Before Insertion: ");
        for (i = 0; i < n; i++)
            System.out.print(arr[i]+" ");

        // Inserting key
        n = insertSorted(arr, n, key, capacity);

        System.out.print("\n After Insertion: ");
        for (i = 0; i < n; i++)
            System.out.print(arr[i]+" ");
    }

    // Function to insert a given key in the array. This function returns n+1 if insertion is successful, else n.
    static int insertSorted(int arr[], int n, int key, int capacity){

        // Cannot insert more elements if n is already more than or equal to capacity
        if (n >= capacity)
            return n;

        arr[n] = key;

        return (n + 1);
    }

}
