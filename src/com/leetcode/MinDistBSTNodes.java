package com.leetcode;

import java.util.*;

class MinDistBSTNodes {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.right.left = new TreeNode(4);
    root.right.right = new TreeNode(3);
    System.out.println("Min diff :: " + minDiffInBST(root));
  }

  static List<Integer> list = new ArrayList<>();
  static int minDiff = Integer.MAX_VALUE;

  public static int minDiffInBST(TreeNode root) {
    inorder(root);
    for (int i = 0; i < list.size() - 1; i++) {
      if (Math.abs(list.get(i) - list.get(i + 1)) < minDiff)
        minDiff = Math.abs(list.get(i) - list.get(i + 1));
    }
    return minDiff;
  }

  public static void inorder(TreeNode root) {
    if (root == null) return;
    inorder(root.left);
    list.add(root.val);
    inorder(root.right);
    return;
  }

  // Definition for a binary tree node.
  static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }
}
