package easy._2600_2699._2600;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.kItemsWithMaximumSum(3, 2, 0, 2));

        assertEquals(3, solution.kItemsWithMaximumSum(3, 2, 0, 4));
    }
}
