package sorting;

import util.ArrUtil;

public class InsertionSort {

    public static int[] sortArray(int[] arr, int n) {
        for(int i=1; i < n; i ++){
            for (int j = i; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    int save = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = save;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(InsertionSort.class.getSimpleName());
        int[] inputArr = ArrUtil.getInputArr();
        System.out.print("Before sorting = ");
        ArrUtil.printArray(inputArr);
        System.out.print("After sorting = ");
        ArrUtil.printArray(sortArray(inputArr, inputArr.length));
    }
}
