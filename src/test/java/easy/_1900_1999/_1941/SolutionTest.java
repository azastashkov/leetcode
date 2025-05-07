package easy._1900_1999._1941;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.areOccurrencesEqual("abacbc"));

        assertFalse(solution.areOccurrencesEqual("aaabb"));
    }
}
