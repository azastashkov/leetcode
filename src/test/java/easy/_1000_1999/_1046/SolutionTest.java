package easy._1000_1999._1046;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(1, solution.lastStoneWeight(new int[] { 2, 7, 4, 1, 8, 1 }));

        assertEquals(1, solution.lastStoneWeight(new int[] { 1 }));
    }
}
