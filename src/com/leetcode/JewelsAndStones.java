package com.leetcode;

class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        int lenS = S.length();
        int lenJ = J.length();
        char jewel;
        int count = 0;
        for(int i=0;i<lenJ;i++) {
            jewel = J.charAt(i);
            for(int j=0;j<lenS;j++) {
                if(S.charAt(j)==jewel)
                    count++;
            }
        }
        return count;
    }
}