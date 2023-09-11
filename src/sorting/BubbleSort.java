package sorting;

import util.ArrUtil;

public class BubbleSort {
    public static int[] sortArray(int[] arr, int n) {
        for(int i=0; i < n - 1; i++){
            //traverse over a array and swap the side element
            for(int j = 0; j < n - 1; j++){
                if(arr[j+1] < arr[j]){
                    int save = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = save;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(BubbleSort.class.getSimpleName());
        int[] inputArr = ArrUtil.getInputArr();
        System.out.print("Before sorting = ");
        ArrUtil.printArray(inputArr);
        System.out.print("After sorting = ");
        ArrUtil.printArray(sortArray(inputArr, inputArr.length));
    }
}
