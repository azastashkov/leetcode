package easy._1200_1299._1221;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(4, solution.balancedStringSplit("RLRRLLRLRL"));

        assertEquals(2, solution.balancedStringSplit("RLRRRLLRLL"));

        assertEquals(1, solution.balancedStringSplit("LLLLRRRR"));
    }
}
