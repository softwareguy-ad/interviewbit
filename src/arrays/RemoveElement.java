package arrays;

import util.ArrUtil;

public class RemoveElement {

        public static int removeElement(int[] nums, int val) {
            int s = nums.length - 1;
            int count = 0;
            for(int i=0; i<s; i++){
                if(nums[i] == val){
                    count++;
                    for(int j=i; j<s; j++ ){
                        int swap = nums[j];
                        nums[j] = nums[j+1];
                        nums[j+1] = swap;
                    }
                }
            }
            ArrUtil.printArray(nums);
            return count;
        }

    public static void main(String[] args) {
        int[] nums1 = new int[]{3,2,2,3};
        int[] nums2 = new int[]{0,1,2,2,3,0,4,2}; // 0,1,3,4,0
        System.out.println(removeElement(nums2, 2));

    }
}
