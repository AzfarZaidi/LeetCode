package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    static List<String> list = new ArrayList<>();

    public static void main (String[] args) {
        System.out.println("Parentheses list :: " + generateParenthesis(3));
    }

    public static List<String> generateParenthesis (int n) {
        String sb = "";
        helper(sb, 0, 0, n);
        return list;
    }

    public static void helper (String sb, int open, int close, int n) {
        if (sb.length() == 2 * n) {
            list.add(sb.toString());
            return;
        }
        if (open < n)
            helper(sb+"(", open+1, close, n);
        if (close < open)
            helper(sb+")", open, close+1, n);

    }
}
