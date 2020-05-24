package com.leetcode;

class KthSymbolGrammar {
  public static int kthGrammar(int N, int K) {
    if (N == 1) return 0;
    if (K % 2 == 0) return kthGrammar(N - 1, K / 2) == 0 ? 1 : 0;
    else if (K % 2 == 1) return kthGrammar(N - 1, (K + 1) / 2) == 0 ? 0 : 1;
    return -1;
  }

  public static void main(String[] args) {
    int n = 3, k = 2;
    System.out.println("Kth symbol in nth row :: " + kthGrammar(n, k));
  }
}
