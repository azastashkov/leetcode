package easy._1600_1699._1656;

import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class OrderedStreamTest {
    @Test
    public void test() {
        OrderedStream orderedstream = new OrderedStream(5);

        assertEquals(Collections.emptyList(), orderedstream.insert(3,"ccccc"));

        assertEquals(List.of("aaaaa"), orderedstream.insert(1, "aaaaa"));

        assertEquals(List.of("bbbbb", "ccccc"), orderedstream.insert(2, "bbbbb"));

        assertEquals(Collections.emptyList(), orderedstream.insert(5, "eeeee"));

        assertEquals(List.of("ddddd", "eeeee"), orderedstream.insert(4, "ddddd"));
    }
}
