package com.leetcode;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int key = nums[0];
        int[] arr = new int[2];
        for(int i=0;i<nums.length;i++) {
            key = target - nums[i];
            for(int j=0;j<nums.length;j++) {
                if(nums[j] == key && j != i) {
                    arr[0] = j;
                    arr[1] = i;
                    break;
                }
            }
        }
        return arr;
    }
}