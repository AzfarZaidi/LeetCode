package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2 {
    static List<List<Integer>> list = new ArrayList<>();

    public static void main (String[] args) {
        int[] arr = new int[]{1, 2, 2};
        System.out.println("Power set :: " + subsetsWithDup(arr));
    }

    public static List<List<Integer>> subsetsWithDup (int[] nums) {
        Arrays.sort(nums);
        helper(nums, new ArrayList<>(), 0);
        return list;
    }

    public static void helper (int[] nums, List<Integer> tempList, int index) {
        if (nums == null || nums.length == 0) {
            list.add(new ArrayList<>());
            return;
        }
        list.add(new ArrayList<>(tempList));
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1])
                continue;
            tempList.add(nums[i]);
            helper(nums, tempList, i + 1);
            tempList.remove(tempList.size() - 1);

        }
    }
}
