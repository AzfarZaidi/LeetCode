package com.leetcode;


class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int res = 0;
        ListNode first = new ListNode(0);
        ListNode node = first;
        while (l1 != null || l2 != null || res != 0) {
            if (l1 != null) {
                res += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                res += l2.val;
                l2 = l2.next;
            }
            node.next = new ListNode(res % 10);
            node = node.next;
            res = res / 10;
        }
        return first.next;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}