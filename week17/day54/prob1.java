/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode p) {
        if(p.next==null)
        return p;
       
        ListNode c=p.next;
        ListNode n=c.next;
        p.next=null;

        while(n!=null){
            ListNode temp=n.next;
            c.next=p;
            n.next=c;
            p=c;
            c=n;
            n=temp;
        }
        
        return c;
    }
}
