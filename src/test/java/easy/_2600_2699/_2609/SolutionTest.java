package easy._2600_2699._2609;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(6, solution.findTheLongestBalancedSubstring("01000111"));

        assertEquals(4, solution.findTheLongestBalancedSubstring("00111"));

        assertEquals(0, solution.findTheLongestBalancedSubstring("111"));
    }
}
