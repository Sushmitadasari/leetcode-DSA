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
    public ListNode removeElements(ListNode head, int val) {
       ListNode temp=new ListNode(0);
       temp.next=head;
       ListNode curr=temp;
       while(curr.next!=null){
         if(curr.next.val==val){
            curr.next=curr.next.next;
         }
         else{
            curr=curr.next;
         }
       }
       return temp.next;
    }
}
