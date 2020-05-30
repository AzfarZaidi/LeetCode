package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationPhoneNum {
    static final String[] keys = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    static List<String> list = new ArrayList<>();

    public static void main (String[] args) {
        String phoneNumber = "23";
        System.out.println("List of combinations :: " + letterCombinations(phoneNumber));
    }

    public static List<String> letterCombinations (String phoneNumber) {
        helper(phoneNumber, 0, "");
        return list;
    }

    public static void helper (String str, int index, String tempstr) {
        if(str == null || str.isEmpty())
            return;
        if (index == str.length()) {
            list.add(tempstr);
            return;
        }
        String letters = keys[str.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            helper(str, index + 1, tempstr + letters.charAt(i));
        }
    }
}
