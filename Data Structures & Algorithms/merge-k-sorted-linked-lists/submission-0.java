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
    private ListNode mergeTwoLists(ListNode list1 , ListNode list2){
        if(list1 == null){
          return list2;
        }
        if(list2 == null){ 
            return list1;
        }
        if(list1.val <= list2.val){
            list1.next = mergeTwoLists(list1.next , list2);
            return list1;
        }
        else{
            list2.next = mergeTwoLists(list1,list2.next);
            return list2;
        }
    }
    
    public ListNode mergeKLists(ListNode[] lists) {
        int i = 0;
        ListNode mergelist = null;
        while(i<lists.length - 1){
            ListNode l1 = lists[i];
            ListNode l2 = lists[i+1];
            
            mergelist = mergeTwoLists(mergelist , mergeTwoLists(l1,l2));

           i += 2;
        }

        int lastlistidx = lists.length -1;
        if(lists.length % 2 == 0){
            return mergelist;
        }
        else{
        return mergeTwoLists(lists[lastlistidx] , mergelist);
        }
    }
}