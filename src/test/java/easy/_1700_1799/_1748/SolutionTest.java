package easy._1700_1799._1748;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(4, solution.sumOfUnique(new int[] { 1, 2, 3, 2 }));

        assertEquals(0, solution.sumOfUnique(new int[] { 1, 1, 1, 1, 1 }));

        assertEquals(15, solution.sumOfUnique(new int[] { 1, 2, 3, 4, 5 }));
    }
}
