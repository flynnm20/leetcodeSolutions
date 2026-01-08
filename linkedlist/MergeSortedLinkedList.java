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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // look at the head value of both lists. whichever is highest is the first value.
        // compare each value and assign next based on which is smaller. 
        // if you reach the end of one attach the next list as next.
        ListNode resultList = new ListNode();
        ListNode head = resultList;
        if(list1 == null){
            return list2;
        } else if(list2 == null){
            return list1;
        }
        
        if(list1.val > list2.val) {
            resultList = list1;
        } else {
            resultList = list2;
        }

        while(list1.next != null && list2.next != null){
            if(list1.val < list2.val) {
                resultList.next = list1;
                list1 = list1.next;
            } else {
                resultList.next = list2;
                list2 = list2.next;
            }
        }
        if(list1.next != null) {
            resultList.next =list1.next;
        } else if(list2.next != null) {
            resultList.next =list2.next;
        }
        return head;
    }
}
