package JavaAlgorithms;

// Merge Sort is a Divide and Conquer algorithm.
// This program use Merge Sort algorithm to sort an array, then it measures in Milliseconds the performance of small code fragment.
// Revisited at 2020-01

import java.util.Arrays;
import java.util.Random;

public class MergeSortMicrobench {

    public static void main(String args[]) {

        Random generator = new Random();

        int sizeOfArray = 1000; // define array size

        int[] testArray = new int[sizeOfArray];
        Arrays.setAll(testArray, i -> generator.nextInt(9999));

        printArray(testArray, "Unsorted array: ");
        long startTime = System.currentTimeMillis();
        mergeSort(testArray);
        printArray(testArray, "\nSorted array: ");
        long endTime = System.currentTimeMillis();
        benchmarkResults(sizeOfArray, endTime, startTime);
    }

    static void mergeSort(int[] array){

        int aLen = array.length;
        if(aLen < 2){
            return;
        }

        int mid = aLen / 2;
        int[] left = new int[mid];
        int[] right = new int[aLen - mid];

        System.arraycopy(array, 0, left, 0, mid - 1 + 1);
        System.arraycopy(array, mid, right, mid - mid, aLen - mid);

        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);

    }

    static void merge(int[] origArr, int[] arrL, int[] arrR){

        int sizeLeft = arrL.length;
        int sizeRight= arrR.length;

        int i = 0, j = 0, k = 0;
        while(i < sizeLeft && j < sizeRight){
            if(arrL[i] <= arrR[j]){
                origArr[k] = arrL[i];
                i++;
            } else{
                origArr[k] = arrR[j];
                j++;
            }
            k++;
        }
        while(i < sizeLeft){
            origArr[k] = arrL[i]; i++; k++;
        }
        while(j < sizeRight){
            origArr[k] = arrR[j]; j++; k++;
        }
    }

    public static int printArray(int[] array, String description){

        int arr = 0;
        System.out.println(description);
        for (int value : array) {
            System.out.print(value + ", ");
        }
        return arr;
    }

    static void benchmarkResults(int sizeOfArray, long endTime, long startTime){
        System.out.println("\n\nMicrobenchmark (" + sizeOfArray + " elements) call took: " + (endTime - startTime) + "ms");
    }

}
