package com.leetcode;

class LongestUnivaluePath {

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.right.left = new TreeNode(4);
    root.right.right = new TreeNode(3);
    System.out.println("Longest univalue path length :: " + longestUnivaluePath(root));
  }

  static int maxLen = Integer.MIN_VALUE;

  public static int longestUnivaluePath(TreeNode root) {
    if (root == null) return 0;
    checkLongestPath(root, root.val);
    return maxLen;
  }

  public static int checkLongestPath(TreeNode root, int val) {
    if (root == null) return 0;
    int left = checkLongestPath(root.left, root.val);
    int right = checkLongestPath(root.right, root.val);
    maxLen = Math.max(maxLen, left + right);
    if (root.val == val) {
      return 1 + Math.max(left, right);
    }
    return 0;
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
