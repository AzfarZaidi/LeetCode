package com.leetcode;

import java.util.*;

public class CombinationSum2 {
    static List<List<Integer>> list = new ArrayList<>();

    public static void main (String[] args) {
        int[] candidates = new int[]{10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        System.out.println("List of combinations :: " + combinationSum2(candidates, target));
    }

    public static List<List<Integer>> combinationSum2 (int[] candidates, int target) {
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates, target, temp, 0);
        return list;
    }

    public static void helper (int[] candidates, int target, List<Integer> temp, int start) {
        if (target == 0) {
            list.add(new ArrayList<>(temp));
            return;
        }
        if (target < 0) return;
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1])
                continue;
            temp.add(candidates[i]);
            helper(candidates, target - candidates[i], temp, i + 1);
            temp.remove(temp.size() - 1);

        }
    }
}
