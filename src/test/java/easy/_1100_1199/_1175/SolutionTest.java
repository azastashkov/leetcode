package easy._1100_1199._1175;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(12, solution.numPrimeArrangements(5));

        assertEquals(682289015, solution.numPrimeArrangements(100));
    }
}
