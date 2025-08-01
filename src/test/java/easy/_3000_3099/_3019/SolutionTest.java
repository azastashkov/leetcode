package easy._3000_3099._3019;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.countKeyChanges("aAbBcC"));

        assertEquals(0, solution.countKeyChanges("AaAaAaaA"));
    }
}
