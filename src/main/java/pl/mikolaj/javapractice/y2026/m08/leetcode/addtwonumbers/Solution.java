package pl.mikolaj.javapractice.y2026.m08.leetcode.addtwonumbers;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = new ListNode();
        ListNode current = head;

        while (true) {
            int l1Val = l1 == null ? 0 : l1.val;
            int l2Val = l2 == null ? 0 : l2.val;

            int sum = l1Val + l2Val + carry;
            current.val = sum  % 10;
            carry = sum / 10;

            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;

            if (l1 != null || l2 != null || carry > 0) {
                current.next = new ListNode();
                current = current.next;
            } else {
                break;
            }
        }
        return head;
    }

    public ListNode addTwoNumbersV1(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = new ListNode();
        ListNode current = head;
        ListNode previous = null;

        while (l1 != null && l2 != null) {
            int val = l1.val + l2.val + carry;
            if (val >= 10) {
                val = val - 10;
                carry = 1;
            } else {
                carry = 0;
            }
            current.val = val;
            current.next = new ListNode();
            previous = current;
            current = current.next;

            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            int val = l1.val + carry;
            if (val >= 10) {
                val = val - 10;
                carry = 1;
            } else {
                carry = 0;
            }
            current.val = val;
            current.next = new ListNode();
            previous = current;
            current = current.next;

            l1 = l1.next;
        }

        while (l2 != null) {
            int val = l2.val + carry;
            if (val >= 10) {
                val = val - 10;
                carry = 1;
            } else {
                carry = 0;
            }
            current.val = val;
            current.next = new ListNode();
            previous = current;
            current = current.next;

            l2 = l2.next;
        }

        if (carry > 0) {
            current.val = carry;
        } else {
            assert previous != null;
            previous.next = null;
        }

        return head;
    }
}
