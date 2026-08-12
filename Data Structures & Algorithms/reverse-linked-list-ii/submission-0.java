/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || head.next == null) {
            return head;
        }

        int i = 0;

        ListNode start = head;
        ListNode end = head;

        ListNode temp = head;
        ListNode prev = null;

        while (temp != null) {
            temp = temp.next;
            i++;

            if (i < left) {
                prev = start;
                start = temp;
            }

            if (i < right) {
                end = temp;
            }
        }

        // Node after the part we want to reverse
        ListNode afterEnd = end.next;

        // Reverse
        ListNode RevPrev = afterEnd;
        ListNode curr = start;

        while (curr != afterEnd) {
            ListNode next = curr.next;
            curr.next = RevPrev;
            RevPrev = curr;
            curr = next;
        }

        // Connect previous part to reversed part
        if (prev != null) {
            prev.next = end;
        } else {
            // left == 1, so end becomes the new head
            head = end;
        }

        return head;
    }
}