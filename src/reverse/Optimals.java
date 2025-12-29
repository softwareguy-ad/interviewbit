package reverse;

import java.util.Arrays;

public class Optimals {
    public static void main(String[] args) {
        int[] arr = {1,34,5,67,2,6,78,8};
        System.out.println("Max element in the list "+findMax(arr));
        System.out.println(Arrays.toString(arr));
        System.out.println("Min element in the list "+findMin(arr));
    }

    private static int findMax(int[] arr) {
        int n = arr.length;
        if(n == 1){
            return arr[0];
        }
        int[] subArr = Arrays.copyOfRange(arr,0, n-1);
        System.out.println(Arrays.toString(subArr));
        return Math.max(arr[n-1], findMax(subArr));
    }

    private static int findMin(int[] arr){
        int n = arr.length;
        if(n == 1){
            return arr[0];
        }
        return Math.min(arr[n-1], findMin(Arrays.copyOfRange(arr, 0, n-1)));
    }
}
