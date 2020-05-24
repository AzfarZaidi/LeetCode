package com.leetcode;// Definition for a binary tree node.

import java.util.*;

class BSTRangeSum {
  static int sum = 0;

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.right.left = new TreeNode(4);
    root.right.right = new TreeNode(3);
    System.out.println("Sum of range 2 to 5 is :: " + rangeSumBST(root, 2, 5));
  }

  public static int rangeSumBST(TreeNode root, int L, int R) {
    util(root, L, R);
    return sum;
  }

  public static void util(TreeNode root, int L, int R) {
    if (root == null) return;
    util(root.left, L, R);
    if (root.val >= L && root.val <= R) sum += root.val;
    util(root.right, L, R);
  }

  static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }
}
