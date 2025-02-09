package easy._0600_0699._0645;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 2, 3 }, solution.findErrorNums(new int[] { 1, 2, 2, 4 }));

        assertArrayEquals(new int[] { 1, 2 }, solution.findErrorNums(new int[] { 1, 1 }));

        assertArrayEquals(new int[] { 2, 1 }, solution.findErrorNums(new int[] { 2, 2 }));

        assertArrayEquals(new int[] { 3, 1 }, solution.findErrorNums(new int[] { 3, 2, 3, 4, 5, 6 }));
    }
}
