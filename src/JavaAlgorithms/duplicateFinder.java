package JavaAlgorithms;

// This program finds duplicates in array
// Revisited at 2020-01

class DuplicateFinder {

    public static void main(String[] args){

        int i = 0;
        int j = 0;
        int[] testArr = {2, 4, 7, 4, 1, 1, 8, 3, 5, 6, 9};

        // 4 - call the function
        DuplicateFinder df = new DuplicateFinder();
        int[] a = df.findDubs(testArr);
        for(int k = 0; k < a.length; k++){
            System.out.println(a[k]);
        }
    }

    public int[] findDubs(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
        }

        int[] dubs = new int[count];
        int x = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    dubs[x] = arr[i];
                    x++;
                }
            }
        }

        return dubs;
    }
}
