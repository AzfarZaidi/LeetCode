package com.leetcode;

class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        sort(nums,0,nums.length-1);
        int sum = 0;
        for(int i=nums.length-1;i>0;i-=2) {
            sum += Math.min(nums[i],nums[i-1]);
        }
        return sum;
    }
    public void sort(int[] arr, int low, int high) {
        if(low < high) {
            int pindex = partition(arr,low,high);
            sort(arr,low,pindex-1);
            sort(arr,pindex+1,high);
        }
    }
    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;
        for (int j=low;j<high;j++) {
            if(arr[j]<pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        
        return i+1;
    }
}