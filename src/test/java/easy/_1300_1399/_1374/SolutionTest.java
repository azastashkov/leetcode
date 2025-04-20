package easy._1300_1399._1374;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("aaa", solution.generateTheString(3));

        assertEquals("aaab", solution.generateTheString(4));
    }
}
