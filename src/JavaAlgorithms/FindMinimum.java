package JavaAlgorithms;

// This program finds minimum or the smallest element in an array
// Revisited at 2020-01

public class FindMinimum {

    public static void main(String args[]) {

        int testArray[] = {2, 5, 77, 103, 564, -5, -975, -354, 65, 45, -98, 1050};

        System.out.println("---- Smallest value in the array is ----");
        System.out.println(findMinimum(testArray));

    }

    static int findMinimum(int[] array){
        int min = array[0];

        for(int i = 1; i < array.length; i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        return min;
    }

}
