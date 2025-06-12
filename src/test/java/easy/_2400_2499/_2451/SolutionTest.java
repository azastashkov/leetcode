package easy._2400_2499._2451;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("abc", solution.oddString(new String[] { "adc", "wzy", "abc" }));

        assertEquals("bob", solution.oddString(new String[] { "aaa", "bob", "ccc", "ddd" }));
    }
}
