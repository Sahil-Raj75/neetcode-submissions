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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = slow;

        while (fast != null && fast.next != null) {
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        temp.next = null;

        // reverse
        ListNode prev = null;
        ListNode curr = slow;
        ListNode next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode h1 = head;
        ListNode next1;
        ListNode h2 = prev;
        while(h2!=null){
            next1 = h1.next;
            h1.next = h2;
            h1 = next1;

            if(h1==null){
                return;
            }
            else{
            prev = prev.next;
            h2.next = h1;
            h2 = prev;
            }
        }
    }
}
