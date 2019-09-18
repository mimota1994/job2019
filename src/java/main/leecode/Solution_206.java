package main.leecode;

public class Solution_206 {

    public ListNode reverseList(ListNode head) {

        ListNode result = null;
        ListNode p = head;
        while(p != null){
            ListNode tmp = p;
            p = p.next;
            tmp.next = null;
            if(result == null){
                result = tmp;
            }else{
                tmp.next = result;
                result = tmp;
            }
        }

        return result;
    }
}
