package com.leetcode;// Definition for a Node.


class NextRightPointer {
    public Node connect(Node root) {
        if(root == null) return root;
        root.next = null;
        Node verticalItr = root;
        while (verticalItr!=null) {
            Node horizontalItr = verticalItr;
            while(horizontalItr!=null) {
                if(horizontalItr.left != null) {
                    horizontalItr.left.next = horizontalItr.right!=null?horizontalItr.right:getRightNode(horizontalItr);
                }
                if(horizontalItr.right!=null) {
                    horizontalItr.right.next = getRightNode(horizontalItr);
                }
                horizontalItr = horizontalItr.next;
            }
            if(verticalItr.left != null)
                verticalItr = verticalItr.left;
            else if (verticalItr.right != null)
                verticalItr = verticalItr.right;
            else
                verticalItr = getRightNode(verticalItr);
        }
        return root;
    }

    public Node getRightNode(Node root) {
        root = root.next;
        while(root != null) {
            if (root.left != null)
                return root.left;
            else if (root.right != null)
                return root.right;
            root = root.next;
        }
        return null;
    }

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
}
