package com.leetcode;

class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        boolean isValid = isValidUtil(root, null, null);
        return isValid;
    }

    public boolean isValidUtil(TreeNode root, Integer min, Integer max) {
        if (root == null)
            return true;
        if ((max != null && root.val >= max) || (min != null && root.val <= min))
            return false;
        boolean left = isValidUtil(root.left, min, root.val);
        boolean right = isValidUtil(root.right, root.val, max);
        return left && right;
    }


    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}