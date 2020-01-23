package JavaAlgorithms;

// QuickSort is a Divide and Conquer algorithm.
// It picks an element as pivot and partitions the given array around the picked pivot.
// This program sorts elements in a given array.
// Revisited at 2020-01

public class QuickSort {

    public static void main(String args[]) {

        int testArray[] = {2, 5, 77, 103, 564, -5, -354, 65, 45, -98, 1050, 99, 45, 23, 457, 658, 391, 6, 8, 49, 72, 34};

        System.out.println("Unsorted Array: ");
        for(int i = 0; i < testArray.length; i++){
            System.out.print(testArray[i] + ", ");
        }

        System.out.println("\nSorted Array with QuickSort: ");
        quickSort(testArray, 0, testArray.length - 1);
        for(int i = 0; i < testArray.length; i++){
            System.out.print(testArray[i] + ", ");
        }
    }

    public static void quickSort(int arr[], int begin, int end) {

        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);
            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    private static int partition(int arr[], int begin, int end) {

        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }
}
