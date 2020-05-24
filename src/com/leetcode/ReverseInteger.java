package com.leetcode;

class ReverseInteger {
    public int reverse(int x) {
        int num =0,d=0;
        int flag=-1;
        if(x<0)flag=1;
        x = Math.abs(x);
        while(x!=0){
            d = x%10;
            if((num > (Integer.MAX_VALUE - d) / 10 && x > 0) || (num < (Integer.MIN_VALUE - d) / 10 && x < 0)) {
                return 0;
            }
            num *=10;
            num += d;
            x /=10;
        }
        if (flag==1)
            num=num*-1;
        return num;
    }
}