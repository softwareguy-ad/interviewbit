package arrays;

import util.ArrUtil;

public class MergeTwoSortedArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n - 1;

        while(i>=0 && j>=0){
            if(nums1[i] >= nums2[j]){
                nums1[k] = nums1[i];
                nums1[i] = 0;
                i--; k--;
            } else {
                nums1[k] = nums2[j];
                j--; k--;
            }
        }

        while(j != -1){
            nums1[k] = nums2[j];
            k--; j--;
        }


        ArrUtil.printArray(nums1);
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{2,2,3,0,0,0};
        int[] nums2 = new int[]{1,5,6};
        merge(nums1, nums1.length - nums2.length, nums2, nums2.length);
    }
}
