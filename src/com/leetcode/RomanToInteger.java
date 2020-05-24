package com.leetcode;

class RomanToInteger {
    public int romanToInt(String s) {
        char ch;
        int sum = 0;
        for(int i=0;i<s.length();i++) {
            ch = s.charAt(i);
            if(i<s.length()-1) {
                if(ch=='I' && s.charAt(i+1)=='V'){
                    sum += 4;
                    i++;
                    continue;
                }
                if(ch=='I' && s.charAt(i+1)=='X'){
                    sum += 9;
                    i++;
                    continue;
                }
                if(ch=='X' && s.charAt(i+1)=='L'){
                    sum += 40;
                    i++;
                    continue;
                }
                if(ch=='X' && s.charAt(i+1)=='C'){
                    sum += 90;
                    i++;
                    continue;
                }
                if(ch=='C' && s.charAt(i+1)=='D'){
                    sum += 400;
                    i++;
                    continue;
                }
                if(ch=='C' && s.charAt(i+1)=='M'){
                    sum += 900;
                    i++;
                    continue;
                }
            }
            
            switch(ch) {
                case 'I':
                    sum += 1;
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'X':
                    sum += 10;
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'C':
                    sum += 100;
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'M':
                    sum += 1000;
                    break;
            }
        }
        return sum;
    }
}