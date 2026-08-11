package pl.mikolaj.javapractice.y2026.m08.leetcode.addtwonumbers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void addTwoNumbers_shouldAddNumbersWithoutCarry() {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        
        ListNode result = solution.addTwoNumbers(l1, l2);
        
        assertEquals(7, result.val);
        assertEquals(0, result.next.val);
        assertEquals(8, result.next.next.val);
        assertNull(result.next.next.next);
    }

    @Test
    void addTwoNumbers_shouldHandleCarryOver() {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(9, new ListNode(9));
        ListNode l2 = new ListNode(1);
        
        ListNode result = solution.addTwoNumbers(l1, l2);
        
        assertEquals(0, result.val);
        assertEquals(0, result.next.val);
        assertEquals(1, result.next.next.val);
        assertNull(result.next.next.next);
    }

    @Test
    void addTwoNumbers_shouldHandleDifferentLengths() {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(9, new ListNode(9));
        
        ListNode result = solution.addTwoNumbers(l1, l2);
        
        assertEquals(0, result.val);
        assertEquals(0, result.next.val);
        assertEquals(1, result.next.next.val);
        assertNull(result.next.next.next);
    }

    @Test
    void addTwoNumbers_shouldHandleSingleNodeLists() {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);
        
        ListNode result = solution.addTwoNumbers(l1, l2);
        
        assertEquals(0, result.val);
        assertEquals(1, result.next.val);
        assertNull(result.next.next);
    }
}
