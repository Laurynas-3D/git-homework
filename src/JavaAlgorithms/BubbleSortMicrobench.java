package JavaAlgorithms;

// Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
// This program use BubbleSort algorithm to sort elements in the given array, then measure execution time in Nanoseconds.
// Revisited at 2020-01

import java.util.Random;

public class BubbleSortMicrobench {

    public static void main(String[] args){

        Random generator = new Random();

        int sizeOfArray = 20; // define array size

        int[] testArray = new int[sizeOfArray];
        for(int i = 0; i < testArray.length; i++){
            testArray[i] = generator.nextInt(99);
        }

        System.out.println("Unsorted Random elements array: ");
        printArray(testArray);
        bubbleSort(testArray);
        System.out.println("\nAfter Bubble sort: ");
        printArray(testArray);

        // micro-benchmarking
        long startTime = System.nanoTime();
        bubbleSort(testArray);
        long endTime = System.nanoTime();
        System.out.println("\n\nMicrobenchmark (" + sizeOfArray + " elements) call took: " + (endTime - startTime) + "ns");

    }

    public static int bubbleSort(int[] array){

        int sorted = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return sorted;
    }

    public static int printArray(int[] array){

        int arr = 0;
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }
        return arr;
    }
}
