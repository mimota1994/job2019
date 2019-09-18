package main.some;

import java.util.HashMap;

public class Cache {
    HashMap<Integer, Entry> map;
    Entry head;
    Entry tail;

    int cap;

    Cache(int cap){
        this.cap = cap;
        map = new HashMap<>();
    }

    public void put(int key){
        if(map.containsKey(key)){
            Entry entry = map.get(key);
            //换到head处
            Entry pre = entry.pre;
            Entry next = entry.next;
            if(pre != null){
                pre.next = next;
            }
            if(next != null){
                next.pre = pre;
            }

            if(entry != head){
                entry.next = head;
                head.pre = entry;
                head = entry;
                head.pre = null;
            }
        }else{
            Entry entry = new Entry(key);
            map.put(key, new Entry(key));
            if(head == null && tail == null){
                head = entry;
                tail = entry;
            }else{
                head.pre = entry;
                entry.next = head;
                head = entry;
                head.pre = null;
            }
            if(map.size() > cap){
                map.remove(tail.val);
                tail.pre.next = null;
                tail.next = null;
                tail.pre = null;
            }
        }
    }

    public static void main(String[] args) {
        Cache c = new Cache(3);
        c.put(1);
        c.put(2);
        c.put(3);
        c.put(1);
        c.put(2);
        System.out.println();
    }



}

class Entry{
    Entry(int key){
        val = key;
    }
    int val;
    Entry next;
    Entry pre;
}
