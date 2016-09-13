package qLifeEvent.interview.solution;

/**
 * https://leetcode.com/problems/rotate-list/
 * 
 * @author ql030422
 * 
 */
public class Solution_61 {
    public ListNode rotateRight(final ListNode head, final int n) {
        if (head == null || head.next == null) {
            return head;
        }
        final ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy, slow = dummy;

        int i;
        for (i = 0; fast.next != null; i++) {
            fast = fast.next;
        }

        for (int j = i - n % i; j > 0; j--) {
            slow = slow.next;
        }

        fast.next = dummy.next; // Do the rotation
        dummy.next = slow.next;
        slow.next = null;

        return dummy.next;
    }
}
