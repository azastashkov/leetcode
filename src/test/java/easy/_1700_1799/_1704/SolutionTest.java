package easy._1700_1799._1704;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.halvesAreAlike("book"));

        assertFalse(solution.halvesAreAlike("textbook"));
    }
}
