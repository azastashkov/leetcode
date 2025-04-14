package easy._1000_1099._1051;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.heightChecker(new int[] { 1, 1, 4, 2, 1, 3 }));

        assertEquals(5, solution.heightChecker(new int[] { 5, 1, 2, 3, 4 }));

        assertEquals(0, solution.heightChecker(new int[] { 1, 2, 3, 4, 5 }));
    }
}
