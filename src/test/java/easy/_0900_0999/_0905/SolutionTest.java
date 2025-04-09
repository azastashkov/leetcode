package easy._0900_0999._0905;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 4, 2, 1, 3 }, solution.sortArrayByParity(new int[] { 3, 1, 2, 4 }));

        assertArrayEquals(new int[] { 0 }, solution.sortArrayByParity(new int[] { 0 }));
    }
}
