package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    static List<List<Integer>> list = new ArrayList<>();

    public static void main (String[] args) {
        int[] nums = new int[]{1, 2, 3};
        System.out.println("List of subsets is :: " + listSubsets(nums));
    }

    public static List<List<Integer>> listSubsets (int[] nums) {
        List<Integer> subset = new ArrayList<>();
        findSubsets(nums, 0, subset);
        return list;
    }

    public static void findSubsets (int[] nums, int index, List<Integer> subset) {
        if (nums == null || nums.length == 0)
            return;
        list.add(new ArrayList<>(subset));
        for (int i = index; i < nums.length; i++) {
            subset.add(nums[i]);
            findSubsets(nums, i + 1, subset);
            subset.remove(subset.size() - 1);
        }
    }
}
