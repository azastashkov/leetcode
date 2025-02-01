package easy._0400_0499._0496;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { -1, 3, -1 },
                solution.nextGreaterElement(new int[] { 4, 1 , 2 }, new int[] { 1, 3, 4, 2 }));

        assertArrayEquals(new int[] { 3, -1 },
                solution.nextGreaterElement(new int[] { 2, 4 }, new int[] { 1, 2, 3, 4 }));
    }
}
