package com.leetcode;

public class BeautifulArrangement {
    public static void main (String[] args) {
        System.out.println("Number of arrangements :: " + countArrangement(2));
    }

    static int count = 0;

    public static int countArrangement (int n) {
        boolean[] visited = new boolean[n + 1];
        helper(1, n, visited);
        return count;
    }

    public static void helper (int pos, int n, boolean[] visited) {
        if (pos > n)
            count++;
        for (int i = 1; i <= n; i++) {
            if (! visited[i] && (pos % i == 0 || i % pos == 0)) {
                visited[i] = true;
                helper(pos + 1, n, visited);
                visited[i] = false;
            }
        }
    }
}
