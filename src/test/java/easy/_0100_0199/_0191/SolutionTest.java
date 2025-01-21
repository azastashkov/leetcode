package easy._0100_0199._0191;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(0, solution.hammingWeight(0));

        assertEquals(1, solution.hammingWeight(1));

        assertEquals(3, solution.hammingWeight(11));

        assertEquals(2, solution.hammingWeight(24));
    }
}
