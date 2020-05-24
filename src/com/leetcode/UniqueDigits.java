package com.leetcode;

public class UniqueDigits {
    public static void main (String[] args) {
        System.out.println("Number of unique-digit numbers :: " + countNumbersWithUniqueDigits(3));
    }

    public static int countNumbersWithUniqueDigits (int n) {
        if (n == 0) return 1;
        int ans = 10; // when there is only one digit
        int base = 9;
        for (int i = 2; i <= 10 && i <= n; i++) {
            base = base * (9 - i + 2);
            ans = ans + base;
        }
        return ans;
    }
}
