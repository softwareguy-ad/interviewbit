package sorting;

import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {11,2,12,4,7,89};
        mergesort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void mergesort(int[] arr) {
        int n = arr.length;
        if(n<2)
            return;
        int mid = n/2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[n - mid];

        for(int i=0; i < mid; i++){
            leftArr[i] = arr[i];
        }
        for(int i=mid; i < n; i++){
            rightArr[i-mid] = arr[i];
        }

        mergesort(leftArr);
        mergesort(rightArr);
        merge(leftArr, rightArr, arr);
    }

    public static void merge(int[] l, int[] r, int[] arr){
        int i=0,j=0,k=0;
        while(i<l.length && j<r.length){
            if(l[i] <= r[j]){
                arr[k] = l[i];
                i++;
            }else{
                arr[k] = r[j];
                j++;
            }
            k++;
        }
        while(i < l.length){
            arr[k] = l[i];
            i++; k++;
        }

        while(j < r.length){
            arr[k] = r[j];
            j++; k++;
        }
    }
}
