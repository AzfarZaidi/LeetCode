package com.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Permutations2 {
    static List<List<Integer>> list = new LinkedList<>();

    public static void main (String[] args) {
        int[] arr = new int[]{1, 1, 2};
        System.out.println("List of Permutations :: " + permuteUnique(arr));
    }

    public static List<List<Integer>> permuteUnique (int[] arr) {
        List<Integer> tempList = new LinkedList<>();
        boolean[] visited = new boolean[arr.length];
        Arrays.sort(arr);
        helper(arr, tempList, visited);
        return list;
    }

    public static void helper (int[] arr, List<Integer> tempList, boolean[] visited) {
        if (arr == null || arr.length == 0) {
            list.add(new LinkedList<>());
            return;
        }
        if (tempList.size() == arr.length) {
            list.add(new LinkedList<>(tempList));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;
            if(i > 0 && arr[i] == arr[i-1] && visited[i-1]) continue;
            tempList.add(arr[i]);
            visited[i] = true;
            helper(arr, tempList, visited);
            tempList.remove(tempList.size() - 1);
            visited[i] = false;
        }
    }
}
