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
        Stack<Integer> stk = new Stack<>();
        ListNode temp = head;
        while(temp != null){
            stk.push(temp.val);
            temp = temp.next;
        }
        // stack me Last element first out 
        // agar fir se hum starting se traverse kare tho stack me element same hona cahiye 
        ListNode current = head;

        while(current != null && current.val == stk.peek()){
            stk.pop();
            current = current.next;
        }    
        return stk.isEmpty();
    }
}