package easy._0200_0299._0268;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.missingNumber(new int[] { 3, 0, 1 }));

        assertEquals(2, solution.missingNumber(new int[] { 0, 1 }));

        assertEquals(8, solution.missingNumber(new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 }));

        assertEquals(0, solution.missingNumber(new int[] { 1 }));

        assertEquals(0, solution.missingNumber(new int[] { 1, 2 }));
    }
}
