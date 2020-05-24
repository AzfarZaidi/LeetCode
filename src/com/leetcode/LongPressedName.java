package com.leetcode;

class LongPressedName {
    public boolean isLongPressedName(String name, String typed) {
        int count1 = 0, count2 = 0;
        while(count1<name.length() && count2<typed.length()) {
            if(name.charAt(count1)==typed.charAt(count2)){
                count1++;
                count2++;
            } else {
                count2++;
            }
        }
        if(count1<name.length()){
            return false;
        }
        return true;
    }
}