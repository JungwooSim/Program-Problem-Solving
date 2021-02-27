package me.study.leetcode;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        int resultValue = 0;

        int[] nums1 = {1,1,2};
        resultValue = removeDuplicatesFromSortedArray.removeDuplicates(nums1);
        System.out.println(resultValue); // input : {1,1,2} , output : 2 (1,2)


        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        resultValue = removeDuplicatesFromSortedArray.removeDuplicates(nums2);
        System.out.println(resultValue); // input : {0,0,1,1,1,2,2,3,3,4} , output : 5 (0,1,2,3,4)
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
        /*
        int count = 1;
        int tmpValue = nums[0];

        for (int num : nums) {
            if (tmpValue != num) {
                count++;
            }
            tmpValue = num;
        }
        return count;
        */
    }
}
