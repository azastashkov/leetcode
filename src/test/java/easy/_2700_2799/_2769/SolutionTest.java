package easy._2700_2799._2769;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(6, solution.theMaximumAchievableX(4, 1));

        assertEquals(7, solution.theMaximumAchievableX(3, 2));
    }
}
