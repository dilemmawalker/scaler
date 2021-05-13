/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode A, int B) {
        ListNode p1=A;
        ListNode p2=A;
        int idx=0;
        if(A==null)
        return A;
        else if(A.next==null){
            return null;
        }
        while(p2!=null && idx++<B){
            p2=p2.next;
        }
        while(p2!=null && p2.next!=null){
            p1=p1.next;
            p2=p2.next;
        }
        if(p2==null){
            return p1.next;
        }
        ListNode temp=p1.next.next;
        p1.next=temp;

        return A;
    }
}
