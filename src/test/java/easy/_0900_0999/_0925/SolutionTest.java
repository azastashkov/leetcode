package easy._0900_0999._0925;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.isLongPressedName("alex", "aaleex"));

        assertFalse(solution.isLongPressedName("saeed", "ssaaedd"));

        assertFalse(solution.isLongPressedName("alex", "aaleexa"));
    }
}
