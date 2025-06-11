package easy._2400_2499._2423;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.equalFrequency("abcc"));

        assertFalse(solution.equalFrequency("aazz"));
    }
}
