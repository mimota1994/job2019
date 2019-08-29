package main.leecode;

import java.util.List;

public class Solution_328 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
//        ListNode node4 = new ListNode(4);
//        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
        Solution_328 s = new Solution_328();
        Object o = s.oddEvenList(node1);
        System.out.println();
    }

    public ListNode oddEvenList(ListNode head) {

        if(head == null){
            return head;
        }

        ListNode odd = null;
        ListNode oddEnd = null;
        ListNode even = null;
        ListNode evenEnd = null;

        int i = 1;
        ListNode p = head;
        while(p != null){
            if(i % 2 == 1){
                if(odd == null && oddEnd == null){
                    odd = p;
                    oddEnd = p;
                    p = p.next;
                    odd.next = null;
                }else{
                    ListNode tmp = p;
                    p = p.next;
                    oddEnd.next = tmp;
                    tmp.next = null;
                    oddEnd = oddEnd.next;
                }
            }else{
                if(even == null && evenEnd == null){
                    even = p;
                    evenEnd = p;
                    p = p.next;
                    even.next = null;
                }else{
                    ListNode tmp = p;
                    p = p.next;
                    evenEnd.next = tmp;
                    tmp.next = null;
                    evenEnd = evenEnd.next;
                }
            }
            i++;
        }

        oddEnd.next = even;
        return odd;
    }
}
