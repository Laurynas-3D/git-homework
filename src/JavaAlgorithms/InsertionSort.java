package JavaAlgorithms;

// Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.
// This program use Insertion Sort algorithm to sort an array
// Revisited at 2020-01
public class InsertionSort {

    public static void main(String[] args) {

        int[] testArray = {2, 4, 7, 4, 1, 7, 89, 105, 4, 2, 25, 65, 47, 78, 104, 1025, 45, 7, 4};

        for(int j = 1; j < testArray.length; j++){
            double key = testArray[j];
            int i = j - 1;
            while(i >= 0 && testArray[i] > key){
                testArray[i + 1] = testArray[i];
                i = i - 1;
            }
            testArray[i + 1] = (int) key;
        }

        System.out.println("Sorted array with Insertion Sort: ");

        for(int i = 0; i < testArray.length; i++){
            System.out.print(testArray[i] + ", ");
        }
    }
}
