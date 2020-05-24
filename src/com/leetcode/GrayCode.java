package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GrayCode {
    /*
    n = 0: 0
    n = 1: 0 | 1
    n = 2: 00, 01 | 11, 10
    n = 3: 000, 001, 011, 010 | 110, 111, 101, 100
    f(n) = f(n - 1) | 2 ^ (n - 1) + f(n - 1)
    */
    static List<Integer> list = new ArrayList<>();

    public static void main (String[] args) {
        System.out.println("list of gray code :: " + grayCode(3));
    }

    public static List<Integer> grayCode (int n) {
        list.add(0);
        for(int digit = 1; digit <= n; digit++) {
            int toAdd = 1 << (digit - 1);
            int size = list.size();
            for(int i = size - 1; i >= 0; i--) 
                list.add(list.get(i) + toAdd);
        }
        return list;
    }

}
