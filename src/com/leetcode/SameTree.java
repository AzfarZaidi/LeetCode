package com.leetcode;

class SameTree {
  public static void main(String[] args) {
    TreeNode head1 = new TreeNode(1);
    head1.left = new TreeNode(2);
    head1.right = new TreeNode(3);
    TreeNode head2 = new TreeNode(1);
    head2.left = new TreeNode(2);
    head2.right = new TreeNode(4);
    System.out.println("The two trees are same :: " + isSameTree(head1, head2));
  }

  public static boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) return true;
    if (p == null || q == null) return false;
    if (p != null && q != null) {
      return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
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
