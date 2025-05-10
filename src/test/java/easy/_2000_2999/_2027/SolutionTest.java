package easy._2000_2999._2027;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(1, solution.minimumMoves("XXX"));

        assertEquals(2, solution.minimumMoves("XXOX"));

        assertEquals(0, solution.minimumMoves("0000"));
    }
}
