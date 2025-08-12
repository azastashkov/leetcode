package easy._3100_3199._3110;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(13, solution.scoreOfString("hello"));

        assertEquals(50, solution.scoreOfString("zaz"));
    }
}
