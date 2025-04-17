package easy._1200_1299._1281;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(15, solution.subtractProductAndSum(234));

        assertEquals(21, solution.subtractProductAndSum(4421));
    }
}
