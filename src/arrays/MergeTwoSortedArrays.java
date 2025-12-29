package arrays;

import util.ArrUtil;


// 1 2 2 3 5 6  2 5 6
//   i k      j

public class MergeTwoSortedArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n - 1;

        while(j>=0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            } else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }

        ArrUtil.printArray(nums1);
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        merge(nums1, nums1.length - nums2.length, nums2, nums2.length);
    }
}
