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
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        ListNode middle=slow.next;
        slow.next=null;
        ListNode previous=null;

        while(middle!=null){
            ListNode next=middle.next;
            middle.next=previous;
            previous=middle;
            middle=next;
        }
       
        ListNode first=head;
        ListNode second=previous;
        while(second!=null){
            ListNode t1=first.next;
            ListNode t2=second.next;

            first.next=second;
            second.next=t1;

           first=t1;
           second=t2;
        }
    }
}
