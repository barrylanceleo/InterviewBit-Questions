package com.barrylanceleo.heaps_and_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by barry on 8/15/16.
 */
public class LeastRecentlyUsedCache {
    private class Pair{
        int value;
        long opNum;

        public Pair(int value, long opNum) {
            this.value = value;
            this.opNum = opNum;
        }
    }

    private int capacity;
    private HashMap<Integer, Pair> cacheMap;
    private long operationNum;
    private TreeMap<Long, Integer> operationKeyMap;



    public LeastRecentlyUsedCache(int capacity) {
        this.capacity = capacity;
        cacheMap = new HashMap<>();
        operationNum = 0;
        operationKeyMap = new TreeMap<>();
    }

    public int get(int key) {
        if(cacheMap.containsKey(key)) {
            Pair accessedPair = cacheMap.get(key);
            operationKeyMap.remove(accessedPair.opNum);
            operationKeyMap.put(operationNum, key);
            accessedPair.opNum = operationNum;
            operationNum++;
            return accessedPair.value;
        }
        else {
            return -1;
        }
    }

    public void set(int key, int value) {

        // if its already cached
        if(cacheMap.containsKey(key)) {
            Pair accessedPair = cacheMap.get(key);
            operationKeyMap.remove(accessedPair.opNum);
            operationKeyMap.put(operationNum, key);
            cacheMap.put(key, new Pair(value, operationNum));
        }
        else if(cacheMap.size() < capacity) {
            cacheMap.put(key, new Pair(value, operationNum));
            operationKeyMap.put(operationNum, key);
        }
        else {
            // remove the oldest entry
            Map.Entry<Long, Integer> oldestEntry = operationKeyMap.firstEntry();
            cacheMap.remove(oldestEntry.getValue());
            operationKeyMap.remove(oldestEntry.getKey());

            // add the new entry
            cacheMap.put(key, new Pair(value, operationNum));
            operationKeyMap.put(operationNum, key);
        }
        operationNum++;
    }
}
