/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int a = 0;
        int b = 0;
        ListNode currA = headA;
        while(currA != null){
            a++;
            currA = currA.next;
        }

        ListNode currB = headB;
        while(currB != null){
            b++;
            currB = currB.next;
        }

        int diff = Math.abs(a-b);
        System.out.println(diff);
        if(a<b){
            int i = 0;
            while(i<diff){
                headB = headB.next;
                i++;
            }
        }
        else{
            int j = 0;
            while(j<diff){
                headA = headA.next;
                j++;
            }
        }

        while(headA !=null  && headB != null){
            if(headA == headB){
                return headA;
            }
            headA =headA.next;
            headB = headB.next;
        }
        return null;
    }
}