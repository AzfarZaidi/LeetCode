package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequenceImproved {
    public static void main (String[] args) {
        int n = 3;
        int k = 3;
        System.out.println("Kth Permutation :: " + getPermutation(n, k));
    }

    public static String getPermutation (int n, int k) {
        StringBuilder sb = new StringBuilder();
        List<Integer> nums = new ArrayList<>();
        int[] fact = new int[n + 1];
        fact[0] = 1;
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac *= i;
            fact[i] = fac;
        }
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }
        k--;
        for (int i = 1; i <= n; i++) {
            int index = k / fact[n - i];
            sb.append(nums.get(index).toString());
            nums.remove(index);
            k -= index * fact[n - i];
        }
        return sb.toString();
    }
}
