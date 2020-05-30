package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    static List<List<String>> list = new ArrayList<>();

    public static void main (String[] args) {
        String str = "aab";
        System.out.println("List of partition :: " + partition(str));
    }

    public static List<List<String>> partition (String str) {
        helper(str, new ArrayList<>(), "", 0);
        return list;
    }

    public static void helper (String str, List<String> tempList, String strTemp, int index) {
        if (str == null || str.isEmpty())
            return;
        if (index == str.length())
            list.add(new ArrayList<>(tempList));

        for (int i = index; i < str.length(); i++) {
            if (isPalindromString(str.substring(index, i+1))) {
                tempList.add(str.substring(index, i+1));
                helper(str, tempList, strTemp , i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static boolean isPalindromString (String str) {
        StringBuilder sb = new StringBuilder(str);
        if (str.equals(sb.reverse().toString()))
            return true;
        return false;
    }
}
