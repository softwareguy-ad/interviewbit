package sorting;

import util.ArrUtil;

public class SelectionSort {
    public static int[] sortArray(int[] arr, int n) {
        int index = 0;
        // 4675923
        // Traverse through the array find the minimum and swap
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            // find minimum
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // swap the elements
            int save = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = save;
        }
        return arr;
    }


    public static void main(String[] args) {
        System.out.println(SelectionSort.class.getSimpleName());
        int[] inputArr = ArrUtil.getInputArr();
        System.out.print("Before sorting = ");
        ArrUtil.printArray(inputArr);
        System.out.print("After sorting = ");
        ArrUtil.printArray(sortArray(inputArr, inputArr.length));
    }
}
