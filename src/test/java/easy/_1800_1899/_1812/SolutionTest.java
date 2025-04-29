package easy._1800_1899._1812;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertFalse(solution.squareIsWhite("a1"));

        assertTrue(solution.squareIsWhite("h3"));

        assertFalse(solution.squareIsWhite("c7"));
    }
}
