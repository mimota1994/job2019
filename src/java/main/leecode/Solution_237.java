package main.leecode;

import java.util.List;

public class Solution_237 {

    public void deleteNode(ListNode node) {
        ListNode pre = node;
        node = node.next;
        while(node != null){
            pre.val = node.val;
            if(node.next == null){
                pre.next = null;
                return;
            }
            node = node.next;
            pre = pre.next;
        }
    }

    public void deleteNode(ListNode node, boolean flag){
        node.val = node.next.val;
        node.next = node.next.next;
    }
}


