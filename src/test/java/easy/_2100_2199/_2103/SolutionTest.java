package easy._2100_2199._2103;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(1, solution.countPoints("B0B6G0R6R0R6G9"));

        assertEquals(1, solution.countPoints("B0R0G0R9R0B0G0"));

        assertEquals(0, solution.countPoints("G4"));

        assertEquals(1, solution.countPoints("B9R9G0R4G6R8R2R9G9"));
    }
}
