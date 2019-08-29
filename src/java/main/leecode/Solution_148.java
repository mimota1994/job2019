package main.leecode;

import java.util.ArrayList;
import java.util.List;

public class Solution_148 {
    public ListNode sortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode t = head;

        while(t != null){
            list.add(t.val);
            t = t.next;
        }

        list.sort(null);
        int i = 0;
        t = head;
        while(t != null){
            t.val = list.get(i);
            i++;
            t = t.next;
        }
        return head;
    }
}
