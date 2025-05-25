package easy._2200_2299._2299;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.strongPasswordCheckerII("IloveLe3tcode!"));

        assertFalse(solution.strongPasswordCheckerII("Me+You--IsMyDream"));

        assertFalse(solution.strongPasswordCheckerII("1aB!"));

        assertTrue(solution.strongPasswordCheckerII("-Aa1a1a1"));
    }
}
