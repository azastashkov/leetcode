package easy._0700_0799._0705;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MyHashSetTest {
    @Test
    public void test() {
        MyHashSet set = new MyHashSet();

        set.add(1);
        set.add(2);

        assertTrue(set.contains(1));
        assertFalse(set.contains(3));

        set.add(2);

        assertTrue(set.contains(2));

        set.remove(2);

        assertFalse(set.contains(2));
    }
}
