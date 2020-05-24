package com.leetcode;

class TwoSumSortedArray {
    public int[] twoSum(int[] numbers, int target) {
        int key = numbers[0];
        int[] arr = new int[2];
        for(int i=0;i<numbers.length;i++) {
            key = target - numbers[i];
            for(int j=numbers.length-1;j>=0;j--) {
                if(numbers[j]==key && j!=i) {
                    arr[0] = j+1;
                    arr[1] = i+1;
                    break;
                }
            }
        }
        return arr;
    }
}