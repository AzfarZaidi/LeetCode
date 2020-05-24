package com.leetcode;

import java.util.*;

public class UniqueBST2 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println("List of tress is :: "+generateBSTList(n).toString());
    }

    public static List<TreeNode> generateBSTList(int n) {
        List<TreeNode> list = new ArrayList<>();
        if(n==0) return null;
        if(n==1) {
            list.add(new TreeNode(1));
            return list;
        }
        list = generateBSTUtil(1,n);
        return list;
    }

    public static List<TreeNode> generateBSTUtil(int start, int end) {
        List<TreeNode> list = new ArrayList<>();
        if(start > end) {
            list.add(null);
            return list;
        }
        if(start == end) {
            list.add(new TreeNode(start));
            return list;
        }
        List<TreeNode> left, right;
        for (int i=start;i<=end;i++) {
            left = generateBSTUtil(start, i-1);
            right = generateBSTUtil(i+1, end);
            for(TreeNode lnode : left) {
                for(TreeNode rnode : right) {
                    TreeNode node = new TreeNode(i);
                    node.right = rnode;
                    node.left = lnode;
                    list.add(node);
                }
            }
        }
        return list;
    }

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) { val = x; }
    }
}
