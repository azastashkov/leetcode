package easy._0400_0499._0461;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.hammingDistance(1, 4));

        assertEquals(1, solution.hammingDistance(3, 1));
    }
}
