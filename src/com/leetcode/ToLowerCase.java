package com.leetcode;

class ToLowerCase {
    public String toLowerCase(String str) {
        char[] ch = str.toCharArray();
        for(int i=0;i<str.length();i++) {
            if (ch[i]>=65 && ch[i]<=90){
                ch[i] =  (char)(ch[i]+32);
            }
        }
        String s = new String(ch);
        return s;
    }
}