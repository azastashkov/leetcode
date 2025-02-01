package easy._0400_0499._0476;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.findComplement(5));

        assertEquals(0, solution.findComplement(1));
    }
}
