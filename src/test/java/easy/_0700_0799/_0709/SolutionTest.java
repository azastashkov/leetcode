package easy._0700_0799._0709;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("hello", solution.toLowerCase("Hello"));

        assertEquals("here", solution.toLowerCase("here"));

        assertEquals("lovely", solution.toLowerCase("LOVELY"));
    }
}
