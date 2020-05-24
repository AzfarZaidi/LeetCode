package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    static List<List<Integer>> list = new ArrayList<>();

    public static void main (String[] args) {
        int[] arr = new int[]{1};
        System.out.println("Permutations :: " + permute(arr));
    }

    public static List<List<Integer>> permute (int[] nums) {
        List<Integer> subList = new ArrayList<>();
        helper(nums, subList);
        return list;
    }

    public static void helper (int[] nums, List<Integer> subList) {
        if (nums == null || nums.length == 0) return;
        if (subList.size() == nums.length)
            list.add(new ArrayList<>(subList));
        for (int i = 0; i < nums.length; i++) {
            if(subList.contains(nums[i]))
                continue;
            subList.add(nums[i]);
            helper(nums, subList);
            subList.remove(new Integer(nums[i]));
        }
    }
}
