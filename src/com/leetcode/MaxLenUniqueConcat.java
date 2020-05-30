package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaxLenUniqueConcat {
    static int maxLenUnique = 0;

    public static void main (String[] args) {
        List<String> array = new ArrayList<>();
        array.add("yy");
        array.add("bkhwmpbiisbldzknpm");
        System.out.println("Max length of concatenated string :: " + concatMaxLength(array));
    }

    public static int concatMaxLength (List<String> array) {
        String sb = "";
        helper(sb, array, 0);
        return maxLenUnique;
    }

    public static void helper (String sb, List<String> array, int index) {
        // in each recursive call, we either select or reject a string and then calculate the max length
        if (index == array.size())
            return;
        if (array.size() == 1) {
            maxLenUnique = array.get(0).length();
            return;
        }
        System.out.println("checking for " + sb + " and " + array.get(index));
        boolean flag = checkUniqueChars(sb.toString(), array.get(index));
        maxLenUnique = flag ? Math.max(maxLenUnique, sb.length() + array.get(index).length()) : maxLenUnique;
        if(flag)
            helper(sb + array.get(index), array, index + 1);
        helper(sb, array, index + 1);
    }

    public static boolean checkUniqueChars (String str1, String str2) {
        Set<Character> set = new HashSet<>();
        for (Character character : str1.toCharArray()) {
            if(set.contains(character)) return false;
            set.add(character);
        }
        for (Character character : str2.toCharArray()) {
            if (set.contains(character))
                return false;
            set.add(character);
        }
        set.clear();
        return true;
    }
}
