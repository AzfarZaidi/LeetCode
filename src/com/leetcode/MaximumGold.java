package com.leetcode;

import java.util.Arrays;

public class MaximumGold {

    public static void main (String[] args) {
        int[][] mine = new int[][]{{0, 0, 0, 0, 0, 0, 32, 0, 0, 20}, {0, 0, 2, 0, 0, 0, 0, 40, 0, 32}, {13, 20, 36, 0, 0, 0, 20, 0, 0, 0}, {0, 31, 27, 0, 19, 0, 0, 25, 18, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 18, 0, 6}, {0, 0, 0, 25, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 21, 0, 30, 0, 0, 0, 0}, {19, 10, 0, 0, 34, 0, 2, 0, 0, 27}, {0, 0, 0, 0, 0, 34, 0, 0, 0, 0}};
        System.out.println("Max Gold :: " + getMaxGold(mine));
    }

    public static int getMaxGold (int[][] mine) {
        boolean[][] visited = new boolean[mine.length][mine[0].length];
        Integer maxGold = 0;
        for (int i = 0; i < mine.length; i++)
            for (int j = 0; j < mine[0].length; j++) {
                System.out.println("=======LOOP START=======");
                maxGold = Math.max(maxGold, helper(mine, i, j, visited, 0));
                for (boolean[] row : visited)
                    Arrays.fill(row, false);

            }

        return maxGold;
    }

    public static int helper (int[][] mine, int row, int col, boolean[][] visited, Integer maxGold) {
        System.out.println("row :: " + row + " col :: " + col);
        if (row == mine.length || col == mine[0].length || row < 0 || col < 0 || mine[row][col] == 0 || visited[row][col]) {
            System.out.println("Base condition met. Returning 0");
            return maxGold;
        }
        int goldValue = mine[row][col];
        visited[row][col] = true;
        int rightGold = helper(mine, row, col + 1, visited, maxGold);
        int leftGold = helper(mine, row, col - 1, visited, maxGold);
        int upGold = helper(mine, row - 1, col, visited, maxGold);
        int downGold = helper(mine, row + 1, col, visited, maxGold);
        System.out.println("rightGold :: " + rightGold + " leftGold :: " + leftGold + " upGold :: " + upGold + " downGold :: " + downGold);
        System.out.println("END row :: " + row + " col :: " + col);
        System.out.println("(Math.max(rightGold, Math.max(leftGold, Math.max(upGold, downGold)))) :: " + (Math.max(rightGold, Math.max(leftGold, Math.max(upGold, downGold)))));
        System.out.println("current value :: " + goldValue + " current max value :: " + maxGold);
        maxGold = maxGold + goldValue + (Math.max(rightGold, Math.max(leftGold, Math.max(upGold, downGold))));
        visited[row][col] = false;
        System.out.println("returning :: " + maxGold);
        return maxGold;
    }
}
