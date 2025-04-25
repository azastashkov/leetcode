package easy._1600_1699._1688;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(6, solution.numberOfMatches(7));

        assertEquals(13, solution.numberOfMatches(14));
    }
}
