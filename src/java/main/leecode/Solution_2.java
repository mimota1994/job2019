package main.leecode;

import java.util.List;

public class Solution_2 {

    public static void main(String[] args) {
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(7);
//        ListNode n3 = new ListNode(3);

        n1.next = n2;
//        n2.next = n3;

        ListNode n4 = new ListNode(9);
        ListNode n5 = new ListNode(2);
//        ListNode n6 = new ListNode(4);

        n4.next = n5;
//        n5.next = n6;

        Solution_2 s = new Solution_2();
        s.addTwoNumbers(n1, n4);

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode left = l1;
        ListNode right = l2;

        ListNode result = null;
        ListNode resultEnd = null;

        int jin = 0;
        while(left != null && right != null){

            int l = left.val;
            int r = right.val;

            ListNode tmp = new ListNode((l + r + jin) % 10);
            jin = (l + r + jin) / 10;

            if(result == null && resultEnd == null){
                result = tmp;
                resultEnd = tmp;
            }else{
                resultEnd.next = tmp;
                resultEnd = resultEnd.next;
            }
            left = left.next;
            right = right.next;
        }

        ListNode index = null;
        if(left != null){
            index = left;
        }
        if(right != null){
            index = right;
        }
        if(index != null){
            while(index != null){
                ListNode tmp = new ListNode((index.val + jin) % 10);
                jin = (index.val + jin) / 10;
                index = index.next;

                if(result == null){
                    result = tmp;
                    resultEnd = tmp;
                }else{
                    resultEnd.next = tmp;
                    resultEnd = resultEnd.next;
                }
            }
        }

        if(jin != 0){
            ListNode tmp = new ListNode(jin);
            resultEnd.next = tmp;
            resultEnd = resultEnd.next;
        }

        return result;
    }
}
