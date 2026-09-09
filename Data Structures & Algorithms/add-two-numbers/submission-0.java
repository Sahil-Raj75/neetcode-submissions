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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode res = new ListNode(0);
        ListNode temp = res;

        ListNode h1 = l1;
        ListNode h2 = l2;

        int add = 0;
        int carry = 0;

        while (h1 != null || h2 != null) {
            // add the curr node value
            if (h1 == null) {
                add = carry + h2.val;
            } else if (h2 == null) {
                add = carry + h1.val;
            } else {
                add = carry + h1.val + h2.val;
            }

            // rem and carry
            int rem = add % 10;
            carry = add / 10;

            // new node to linked list;
            temp.next = new ListNode(rem);
            temp = temp.next;

            if (h1 != null) {
                h1 = h1.next;
            }
            if (h2 != null) {
                h2 = h2.next;
            }
        }
        if (carry != 0) {
            temp.next = new ListNode(carry);
        }

        return res.next;
    }
}
