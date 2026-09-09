class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode before = null;
        int pos = 1;
        ListNode t = head;
        if(head==null) {
            return null;
        }
        if(left==right) {
            return head;
        }
        while(t!=null) {
            if(pos<left) {
                before = t;
                t = t.next;
                pos++;
                continue;
            }
            //position == left from here
            ListNode prev = null;
            ListNode curr = t;
            int times = right-left+1;
            while(times-->0) {
                ListNode nex = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nex;
            }
            t.next = curr;
            if(before!=null) {
                before.next = prev;
            } else {
                head = prev;
            }
            return head;
        }
        return head;
    }
}