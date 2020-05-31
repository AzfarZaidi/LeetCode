package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {
    static List<List<Integer>> list = new ArrayList<>();

    public static void main (String[] args) {
        int n = 3;
        int k = 3;
        System.out.println("Kth Permutation :: " + getPermutation(n, k));
    }

    public static String getPermutation (int n, int k) {
        List<Integer> tempList = new ArrayList<>();
        boolean[] visited = new boolean[n];
        helper(n, tempList, visited);
        System.out.println("list :: " + list);
        String str = "";
        for (Integer ele : list.get(k - 1)) {
            str = str.concat(String.valueOf(ele));
        }
        return str;
    }

    public static void helper (int n, List<Integer> tempList, boolean[] visited) {
        if (n == 0) {
            list.add(new ArrayList<>());
            return;
        }
        if (tempList.size() == n) {
            list.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (visited[i - 1]) continue;
            tempList.add(i);
            visited[i - 1] = true;
            helper(n, tempList, visited);
            tempList.remove(tempList.size() - 1);
            visited[i - 1] = false;
        }
    }
}
