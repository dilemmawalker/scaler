/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int idx1, int idx2) {
        if(head==null || head.next==null)
        return head;

        int idx=1;
        ListNode tempp=head;
        while(idx<idx1){
            head=head.next;
        }

        ListNode p=head;
        head=head.next;
        ListNode c=head;
        ListNode n=head.next;
       
        while(idx>=idx1 && idx<=idx2 && n!=null){
            ListNode temp=n;
            c.next=p;
            p=c;
            c=n;
            n=temp.next;
            idx++;
            head=head.next;
        }
    }
}
