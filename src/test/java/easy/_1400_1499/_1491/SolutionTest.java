package easy._1400_1499._1491;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2500d, solution.average(new int[] { 4000, 3000, 1000, 2000 }), 0.00001);

        assertEquals(2000d, solution.average(new int[] { 1000, 2000, 3000 }), 0.00001);
    }
}
