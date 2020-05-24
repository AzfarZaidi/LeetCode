package com.leetcode;

class CountUniqueBST {
    public static void main(String[] args) {
        int n = 3;
        System.out.println("No. of unique BSTs is :: "+countUniqueBSTs(n));
    }

    public static int countUniqueBSTs(int n) {
        int count = catalanNumber(n);
        return count;
    }

    public static int catalanNumber(int n) {
        int res = 0;
        if(n <= 1)
            return 1;
        else {
            for(int i=0;i<n;i++) {
                res += catalanNumber(i)*catalanNumber(n-i-1);
            }
        }
        return res;
    }
}
