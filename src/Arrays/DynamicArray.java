package Arrays;
/**
 This program: / from SDA course
 - Code example of Dynamic Array

 Some Notes:
 - Key features of a dynamic array are adding, deleting and resizing an element.
 - Elements are added at the end of an array.

 Created at 2020-02
 */

public class DynamicArray {

    public static void main(String[] args) {

        DynArray dArr = new DynArray();
        dArr.add(5);
        dArr.add(7);
        dArr.add(0);
        dArr.add(4);
        dArr.add(7);
        dArr.add(0);
        dArr.add(4);

        for(int i = 0; i < dArr.getSize(); i++)
            System.out.print("{" + dArr.get(i) + "} ");
        System.out.println();
    }
}

class DynArray{

    int[] arr;
    private int currentIdx;

    public DynArray(){
        arr = new int[2];
        currentIdx = 0;
    }

    public void add(int i){

        if(currentIdx == arr.length - 1){

            int[] tmpArray = new int[arr.length * 2];
            for(int j = 0; j < arr.length; j++){
                tmpArray[j] = arr[j];
            }
            arr = tmpArray;
        }
        arr[currentIdx] = i;
        currentIdx++;
    }

    public int get(int idx){
        return arr[idx];
    }

    public int getSize(){
        return currentIdx;
    }

    // public void append(int idx, int i){}
}
