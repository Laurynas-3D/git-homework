package JavaAlgorithms;

// Merge Sort is a Divide and Conquer algorithm.
// This program use Merge Sort algorithm to sort an array
// Revisited at 2020-01
public class MergeSort {

    public static void main(String[] args) {

        int[] testArr = {3, 2, 1, 7, -99, 22, -68, -54, 105, 22, 78, -23, 65, 125, -456, 1028, 74, 98};

        mergeSort(testArr);

        System.out.print("Merge sort: \n");
        for(int i = 0; i < testArr.length; i++){
            System.out.print(testArr[i] + ", ");
        }
    }

    static void mergeSort(int[] arr){
        int aLen = arr.length;
        if(aLen < 2){
            return;
        }

        int mid = aLen / 2;
        int[] left = new int[mid];
        int[] right = new int[aLen - mid];

        for(int i = 0; i <= mid - 1; i++)
            left[i] = arr[i];

        for(int i = mid; i <= aLen - 1; i++)
            right[i - mid] = arr[i];

        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
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

}
