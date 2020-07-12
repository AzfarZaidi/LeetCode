package com.leetcode;

public class SearchInRotatedSortedArray {
    public static void main (String[] args) {
        int[] arr = new int[]{4,5,6,7,0,1,2};
        int target = 0;
        System.out.println("Index of "+target+" is :: "+searchTargetInRotatedArray(arr, target));
    }

    public static int searchTargetInRotatedArray(int[] arr, int target) {
        int low = 0;
        int high = arr.length -1;
        if (low > high) return -1;
        while (low <= high) {
            int mid = (high + (high-low))/2;
            int midele = arr[mid];
            if (target == midele)
                return mid;

            // check whether left is sorted
            if (arr[low] <= arr[mid]) {
                //target lies in left
                if (target >= arr[low] && target <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // check whether right is sorted
            else if (arr[mid] <= arr[high]) {
                // target lies in right
                if (target >= arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
