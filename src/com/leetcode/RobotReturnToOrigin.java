package com.leetcode;

class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        int sumy = 0, sumx = 0;
        for(int i=0;i<moves.length();i++) {
            if(moves.charAt(i)=='U')
                sumy += 1;
            else if (moves.charAt(i)=='D')
                sumy += -1;
            else if (moves.charAt(i)=='R')
                sumx += 1;
            else if (moves.charAt(i)=='L')
                sumx += -1;
        }
        if(sumx == 0 && sumy == 0)
            return true;
        return false;
    }
}