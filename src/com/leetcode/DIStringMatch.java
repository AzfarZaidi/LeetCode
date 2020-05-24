package com.leetcode;

class DIStringMatch {
    public int[] diStringMatch(String S) {
        int n = S.length();
        int low = 0, high = n;
        int[] ans = new int[n+1];
        for(int i=0;i<n;i++) {
            if(S.charAt(i)=='I')
                ans[i] = low++;
            else if(S.charAt(i)=='D')
                ans[i] = high--;
        }
        ans[n] = low;
        return ans;
    }
}