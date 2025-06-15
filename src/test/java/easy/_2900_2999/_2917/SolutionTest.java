package easy._2900_2999._2917;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(9, solution.findKOr(new int[] { 7, 12, 9, 8, 9, 15 }, 4));
    }
}
