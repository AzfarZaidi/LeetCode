package com.leetcode;

class TribonacciSeries {
  public static int tribonacci(int n) {
    int[] trib = new int[38];
    trib[0] = 0;
    trib[1] = 1;
    trib[2] = 1;
    int sum = trib[0] + trib[1] + trib[2];
    for (int i = 3; i <= n; i++) {
      trib[i] = trib[i - 1] + trib[i - 2] + trib[i - 3];
    }
    return trib[n];
  }

  public static void main(String[] args) {
    int n = 35;
    System.out.println("nth tribbonacci number is :: " + tribonacci(n));
  }
}
