package easy._0700_0799._0703;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KthLargestTest {
    @Test
    public void test() {
        KthLargest kthLargest1 = new KthLargest(3, new int[] { 4, 5, 8, 2 });

        assertEquals(4, kthLargest1.add(3));
        assertEquals(5, kthLargest1.add(5));
        assertEquals(5, kthLargest1.add(10));
        assertEquals(8, kthLargest1.add(9));
        assertEquals(8, kthLargest1.add(4));

        KthLargest kthLargest2 = new KthLargest(4, new int[] { 7, 7, 7, 7, 8, 3 });

        assertEquals(7, kthLargest2.add(2));
        assertEquals(7, kthLargest2.add(10));
        assertEquals(7, kthLargest2.add(9));
        assertEquals(8, kthLargest2.add(9));
    }
}
