package easy._0800_0899._0844;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.backspaceCompare("ab#c", "ad#c"));

        assertTrue(solution.backspaceCompare("ab##", "c#d#"));

        assertFalse(solution.backspaceCompare("a#c", "b"));
    }
}
