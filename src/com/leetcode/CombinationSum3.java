package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
    static List<List<Integer>> list = new ArrayList<>();
    public static void main (String[] args) {
        int k = 2, n = 6;
        System.out.println("Combination list :: " + combinationSum3(k, n));
    }

    public static List<List<Integer>> combinationSum3 (int k, int n) {
        List<Integer> temp = new ArrayList<>();

        helper(0, k, n, temp, 1);
        return list;
    }

    public static void helper (int currSum, int k, int n, List<Integer> temp, int start) {
        if (currSum == n && k == 0) {
            list.add(new ArrayList<>(temp));
            return;
        }
        if (k == 0)
            return;
        for (int i = start; i < 10; i++) {
            if ((i <= (n - currSum))) {
                temp.add(i);
                helper(currSum + i, k - 1, n, temp, i + 1);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
