package arrays;

import java.util.Arrays;

class Merger {

    public static void main(String[] args) {
        int[] a = {1,2,4,6,8,10};
        int[] b = {3,5,7,9};

        merge(a, a.length, b, b.length);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0, j=0, k=0;
        int nums[] = new int[m+n];
        int l = nums.length;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                nums[k] = nums1[i];
                i++;
            } else {
                nums[k] = nums2[j];
                j++;
            }
            k++;
        }

        while(i<m){
            nums[k] = nums1[i];
            i++;
            k++;
        }

        while(j<n){
            nums[k] = nums2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
