package easy._0400_0499._0401;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        List<String> list1 = Arrays.asList("0:01", "0:02", "0:04", "0:08", "0:16", "0:32", "1:00", "2:00", "4:00", "8:00");

        assertEquals(list1, solution.readBinaryWatch(1));

        assertEquals(Collections.emptyList(), solution.readBinaryWatch(9));
    }
}
