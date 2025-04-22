package easy._1400_1499._1486;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(8, solution.xorOperation(5, 0));

        assertEquals(8, solution.xorOperation(4, 3));

        assertEquals(7, solution.xorOperation(1, 7));
    }
}
