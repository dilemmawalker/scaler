/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null||head.next==null)
        return head;

        ListNode temp=head;
        ListNode p=head;
        head=head.next;
        while(head!=null){
            if(head.val!=p.val){
                p.next=head;
                p=head;
                head=head.next;
            }
            else{
                head=head.next;
            }
        }
        p.next=head;
        return temp;
    }
}
