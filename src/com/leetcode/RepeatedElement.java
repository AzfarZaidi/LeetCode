package com.leetcode;

class RepeatedElement {
    public int repeatedNTimes(int[] A) {
        int key = 0;
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i]==A[j]){
                    key = A[i];
                    break;
                }
            }
        }
        return key;
    }
}