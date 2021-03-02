package me.study.leetcode;

/*
Given a sorted array of distinct integers and a target value,
return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        SearchInsertPosition sip = new SearchInsertPosition();

        int[] nums = {1,3,5,6};
        System.out.println(sip.searchInsert(nums, 5)); // result : 2

        System.out.println(sip.searchInsert(nums, 2)); // result : 1

        System.out.println(sip.searchInsert(nums, 7)); // result : 4

        System.out.println(sip.searchInsert(nums, 0)); // result : 0

        int[] nums2 = {1};
        System.out.println(sip.searchInsert(nums, 0)); // result : 0
    }

    public int searchInsert(int[] nums, int target) {
        if (nums.length <= 0) return 0;
        // 한바퀴 돌리기
        for (int i=0; i < nums.length; i++) {
            if (nums[i] >= target) return i;
        }
        return nums.length;
    }
}
