package easy._0900_0999._0933;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecentCounterTest {
    @Test
    public void test() {
        RecentCounter counter = new RecentCounter();

        assertEquals(1, counter.ping(1));

        assertEquals(2, counter.ping(100));

        assertEquals(3, counter.ping(3001));

        assertEquals(3, counter.ping(3002));
    }
}
