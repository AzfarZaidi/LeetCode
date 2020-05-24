package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    static List<List<Integer>> list = new ArrayList<>();

    public static void main (String[] args) {
        int k = 2, n = 6;
        System.out.println("Combination list :: " + combine(n, k));
    }

    public static List<List<Integer>> combine (int n, int k) {
        List<Integer> temp = new ArrayList<>();
        helper(k, n, temp, 1);
        return list;
    }

    public static void helper (int k, int n, List<Integer> temp, int start) {
        if (k == 0) {
            list.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i <= n; i++) {
            temp.add(i);
            helper(k - 1, n, temp, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
