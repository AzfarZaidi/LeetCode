package com.leetcode;

class SquaresOfSortedArray {
    public int[] sortedSquares(int[] A) {
        int left = 0, right = A.length-1, resIndex = A.length-1;
        int[] res = new int[A.length];
        while(left <= right) {
            if(Math.abs(A[right]) > Math.abs(A[left])) {
                res[resIndex] = A[right] * A[right];
                right--;
                resIndex--;
            } else {
                res[resIndex] = A[left] * A[left];
                left++;
                resIndex--;
            }
        }
        return res;
    }
}