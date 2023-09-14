package arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{0,0,1,1,2,2,3,4,7};
        System.out.println(removeDuplicates(nums1));

    }
}
