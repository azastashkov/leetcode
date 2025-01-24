package easy._0200_0299._0232;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyQueueTest {
    @Test
    public void test() {
        MyQueue queue = new MyQueue();

        queue.push(1);
        queue.push(2);
        queue.push(3);

        assertEquals(1, queue.peek());
        assertEquals(1, queue.pop());

        queue.push(4);

        assertEquals(2, queue.pop());
        assertEquals(3, queue.pop());
        assertEquals(4, queue.pop());

        assertTrue(queue.empty());
    }
}
