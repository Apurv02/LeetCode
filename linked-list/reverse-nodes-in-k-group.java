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
    void reverse(ListNode head, int times) {
        ListNode prev = null;
        ListNode curr = head;
        while(times-->0)
        {
            ListNode nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        return;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null) {
            return null;
        }

        ListNode left = head;
        ListNode prevleft = null;
        ListNode res = null;
        ListNode right;
        while(true) {
            right = left;
            for(int i=0 ; i<k-1; i++) {
                if(right!=null) {
                    right = right.next;
                }
            } //for loop end

            if(right!=null) {
               ListNode nextleft = right.next;
            reverse(left,k);
            
            if(prevleft!=null) {
                prevleft.next = right;
            }

            prevleft = left;
            if(res==null) {
                res = right;
            }
            left = nextleft;
            }

            else {
                if(prevleft!=null) {
                    prevleft.next = left;
                }
                if(res==null) {
                    res = left;
                }
                break;
            }
        }
        return res;
    }
}