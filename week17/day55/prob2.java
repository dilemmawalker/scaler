/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp=reverse(head);
        temp.next=null;
        return fi;
    }
    public ListNode fi;
    public ListNode reverse(ListNode head) {
        if(head==null || head.next==null){
        fi=head;
        return head;
    }

        ListNode temp=reverse(head.next);
        temp.next=head;
        return head;
    }
}
