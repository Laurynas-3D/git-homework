package JavaAlgorithms;
// This program finds duplicates in array
// Revisited at 2020-01

public class allDuplicates {

    public static void main(String[] args){

        int[] testArray = {2, 4, 7, 4, 1, 7, 89, 105, 4, 2, 25, 65, 47, 78, 104, 1025, 45, 7, 4};
        findDuplicates(testArray);
    }

    public static void findDuplicates(int[] array){
        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length; j++){
                if(array[i] == array[j]){
                    System.out.println(array[i]);
                }
            }
        }
    }
}