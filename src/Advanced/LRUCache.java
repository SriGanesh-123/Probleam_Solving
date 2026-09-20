package Advanced;
import java.util.*;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {
    private final int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true); // access-order
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(2);
        cache.put(1, "one");
        cache.put(2, "two");
        System.out.println(cache.keySet()); // [1,2]
        cache.get(1);
        cache.put(3, "three");
        System.out.println(cache.keySet()); // [1,3] -> 2 evicted
    }
}
