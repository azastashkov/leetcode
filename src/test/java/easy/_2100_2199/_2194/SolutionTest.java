package easy._2100_2199._2194;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(Arrays.asList("K1", "K2", "L1", "L2"), solution.cellsInRange("K1:L2"));

        assertEquals(Arrays.asList("A1", "B1", "C1", "D1", "E1", "F1"), solution.cellsInRange("A1:F1"));
    }
}
