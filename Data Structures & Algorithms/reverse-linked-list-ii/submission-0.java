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
        ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode leftStart=dummy;
        ListNode current=head;
        for(int i=0;i<left-1;i++){
            leftStart=leftStart.next;
            current=current.next;
        }
        ListNode middle=leftStart;
        ListNode tail=current;
        leftStart.next=null;

        ListNode previous=null;
        for(int i=0;i<=(right-left);i++){

            ListNode next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        
       middle.next=previous;
       tail.next=current;

        return dummy.next;
    }
}