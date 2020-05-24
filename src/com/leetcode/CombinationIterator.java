package com.leetcode;

import java.util.ArrayList;

public class CombinationIterator {
    ArrayList<String> list = new ArrayList<>();
    String orig;
    int comLength, index = 0;

    public CombinationIterator(String characters, int combinationLength) {
        orig = characters;
        comLength = combinationLength;
        generateCombinations( "", combinationLength, 0 );
    }

    public void generateCombinations(String str, int k, int index) {
        if (k == 0) list.add( str );
        else {
            for (int i = index; i <= orig.length() - k; i++) {
                generateCombinations( str + orig.charAt( i ), k - 1, i + 1 );
            }
        }
    }

    public String next() {
        return list.get( index++ );
    }

    public boolean hasNext() {
        if (index >= list.size())
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        String characters = "abcde";
        int combinationLength = 3;
        CombinationIterator obj = new CombinationIterator( characters, combinationLength );
        String param_1 = obj.next();
        boolean param_2 = obj.hasNext();
        System.out.println( param_1 + " " + param_2 );
    }
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
