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
        ListNode tempA = headA;
        ListNode tempB = headB;

        int positionA = 0;
        int positionB = 0;

        while(tempA != null){
            positionA++;
            tempA = tempA.next;
        }
        while(tempB != null){
            positionB++;
            tempB = tempB.next;
        }

        int gapOfab = Math.abs(positionA-positionB);

        // setback to initial position
        tempA = headA;
        tempB = headB;
        
        // jo jaldi pahuch gaya end pe mtlb uska path chota tha.
        // tho lambe path pe chal rhe pointer ko jaldi chle wale pointer ke bich ke gap ko cove krna pare ga tho kase kre ;
        // hum lambe path wale pointer ko utna step pehle chala dete hai taki dono ko same step lg rha ho last tak pahuchne ke liye
        if(positionA > positionB){
            int i = 0;
            while(i<gapOfab){
                tempA = tempA.next;
                i++;
            }
        }
        else{
            int j = 0;
            while(j<gapOfab){
                tempB = tempB.next;
                j++;
            }
        }

        // abb dono ko same step lagenge 
        while(tempA != null && tempB != null){
            if(tempA == tempB){
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return null;
    }
}