package com.leetcode;

class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int rev = 0, digit = 0, temp = x;
        if(x < 0) {
            return false;
        }
        while(x!=0) {
            digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
        }
        if(rev == temp) {
            return true;
        }
        return false;
    }
}