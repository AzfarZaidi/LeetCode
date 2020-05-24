package com.leetcode;

import java.util.*;

class SymmetricTree {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.right.left = new TreeNode(4);
    root.right.right = new TreeNode(3);
    System.out.println("Tree is symmetric :: " + isSymmetric(root));
  }

  public static boolean isSymmetric(TreeNode root) {
    return isMirrorImage(root, root);
  }

  public static boolean isMirrorImage(TreeNode root1, TreeNode root2) {
    if (root1 == null && root2 == null) return true;
    if (root1 != null && root2 != null && root1.val == root2.val) {
      return isMirrorImage(root1.left, root2.right) && isMirrorImage(root1.right, root2.left);
    }
    return false;
  }

  static class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
      val = x;
    }
  }
}
