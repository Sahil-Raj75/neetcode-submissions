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
    public boolean isPalindrome(ListNode head) {
        // reverse the whole list
        StringBuilder sb = new StringBuilder();
        ListNode temp = head;
        while(temp != null){
            sb.append(String.valueOf(temp.val));
            temp = temp.next;
        }

        String original = sb.toString();
        String rev = sb.reverse().toString();

        return original.equals(rev) ? true : false;
    }
}