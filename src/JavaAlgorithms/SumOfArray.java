package JavaAlgorithms;

// This program adds up all the elements in the given array
// Revisited at 2020-01

public class SumOfArray {

    public static void main(String[] args) {

        int testArray[] = {2, 5, 77, 103, 564, -5, -354, 65, 45, -98, 1050};

        System.out.println("---- The sum of Array is ----");
        System.out.println(sumOfArray(testArray));

    }

    static int sumOfArray(int[] array){

        int sum = 0;
        for(int i = 0; i < array.length; i = i + 1){
            sum += array[i]; // sum = sum + array[i];
        }
        return sum;
    }
}
