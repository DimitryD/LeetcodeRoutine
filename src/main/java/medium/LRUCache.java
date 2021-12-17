package medium;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
    Map<Integer, Integer> cache;
    public LRUCache(int capacity) {
        cache = new LinkedFixedSizeHashMap<>(capacity);
    }

    public int get(int key) {
        return cache.getOrDefault(key, - 1);
    }

    public void put(int key, int value) {
        cache.put(key, value);
    }
}

class LinkedFixedSizeHashMap<K, V> extends LinkedHashMap<K, V> {
    int maxCapacity;
    public LinkedFixedSizeHashMap(int capacity) {
        super(capacity, 0.75f, true);
        maxCapacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > maxCapacity;
    }
}
