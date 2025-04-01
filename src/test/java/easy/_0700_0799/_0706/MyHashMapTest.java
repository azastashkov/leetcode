package easy._0700_0799._0706;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyHashMapTest {
    @Test
    public void test() {
        MyHashMap map = new MyHashMap();

        map.put(1, 1);
        map.put(2, 2);

        assertEquals(1, map.get(1));
        assertEquals(-1, map.get(3));

        map.put(2, 1);

        assertEquals(1, map.get(2));

        map.remove(2);

        assertEquals(-1, map.get(2));
    }
}
