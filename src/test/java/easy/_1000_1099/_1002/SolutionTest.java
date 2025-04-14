package easy._1000_1099._1002;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(Arrays.asList( "e", "l", "l"), solution.commonChars(new String[] { "bella", "label", "roller" }));

        assertEquals(Arrays.asList( "c", "o" ), solution.commonChars(new String[] { "cool", "lock", "cook" }));

        assertEquals(Collections.emptyList(), solution.commonChars(new String[] {
                "acabcddd", "bcbdbcbd", "baddbadb", "cbdddcac", "aacbcccd", "ccccddda", "cababaab", "addcaccd" }));
    }
}
