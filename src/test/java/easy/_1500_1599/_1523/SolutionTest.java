package easy._1500_1599._1523;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.countOdds(3, 7));

        assertEquals(1, solution.countOdds(8, 10));
    }
}
