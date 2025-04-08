package easy._0800_0899._0868;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.binaryGap(22));

        assertEquals(0, solution.binaryGap(8));

        assertEquals(2, solution.binaryGap(5));
    }
}
