package easy._1000_1099._1025;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.divisorGame(2));

        assertFalse(solution.divisorGame(3));
    }
}
