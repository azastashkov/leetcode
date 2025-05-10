package easy._2000_2999._2011;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(1, solution.finalValueAfterOperations(new String[] { "--X", "X++", "X++" }));

        assertEquals(3, solution.finalValueAfterOperations(new String[] { "++X", "X++", "X++" }));

        assertEquals(0, solution.finalValueAfterOperations(new String[] { "X++", "++X", "--X", "X--" }));
    }
}
