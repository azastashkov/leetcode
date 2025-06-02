package easy._2300_2399._2379;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.minimumRecolors("WBBWWBBWBW", 7));

        assertEquals(0, solution.minimumRecolors("WBWBBBW", 2));

        assertEquals(3, solution.minimumRecolors("BWWWBB", 6));
    }
}
