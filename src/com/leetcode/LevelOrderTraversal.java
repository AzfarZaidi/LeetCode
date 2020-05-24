package com.leetcode;// Definition for a binary tree node.
import java.util.*;

class LevelOrderTraversal {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.right.left = new TreeNode(4);
    root.right.right = new TreeNode(3);
    System.out.println("Level order traversal ::" + levelOrder(root));
  }

  public static List<List<Integer>> levelOrder(TreeNode root) {
    // O(n) using queue. 2 while loops. in outer loop, get count of nodes in current level = no. of
    // nodes present in queue. in inner loop, pop all nodes of prev level and insert all nodes of
    // current level..
    if (root == null) return new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    List<List<Integer>> list = new ArrayList<>();
    while (true) {
      int nodeCount = queue.size();
      List<Integer> innerList = new ArrayList<>();
      if (nodeCount == 0) break;
      while (nodeCount != 0) {
        TreeNode node = queue.peek();
        innerList.add(node.val);
        queue.remove();
        if (node.left != null) queue.add(node.left);
        if (node.right != null) queue.add(node.right);
        nodeCount--;
      }
      list.add(innerList);
    }
    return list;
  }

  public static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

}
