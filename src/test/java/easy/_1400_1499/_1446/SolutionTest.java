package easy._1400_1499._1446;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.maxPower("leetcode"));

        assertEquals(5, solution.maxPower("abbcccddddeeeeedcba"));

        assertEquals(11, solution.maxPower("hooraaaaaaaaaaay"));
    }
}
