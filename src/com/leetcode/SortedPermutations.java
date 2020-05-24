package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class SortedPermutations {
    static ArrayList<String> list = new ArrayList<>();
    static String orig = "abcde";

    public static void main(String[] args) {
        sortedPermutations( "", 3, 0 );
        System.out.println( "sorted permutations are ::" + list );
    }

    public static void sortedPermutations(String str, int k, int index) {
        if (k == 0) list.add( str );
        else {
            for (int i = index; i <= orig.length() - k; i++) {
                sortedPermutations( str + orig.charAt( i ), k - 1, i + 1 );
            }
        }
    }
}
