package com.leetcode;

class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int[] res = new int[A.length];
        int k=0;
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0) {
                res[k]=A[i];
                k++;
            }
        }
        for(int i=0;i<A.length;i++){
            if(A[i]%2!=0) {
                res[k]=A[i];
                k++;
            }
        }
        return res;
    }
}