package main.leecode;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU {
    private int cap;
    private int PERSIST = 0;

    public LRU(int cap){
        this.cap = cap;
    }
    private LinkedHashMap lru = new LinkedHashMap(8, 0.75f, true){
        protected boolean removeEldestEntry(Map.Entry eldest) {
            if(this.size() > cap){
                return true;
            }else{
                return false;
            }
        }
    };
    public synchronized void put(Object key){
        lru.put(key, PERSIST);
    }
}
