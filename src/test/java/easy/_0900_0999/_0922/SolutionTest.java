package easy._0900_0999._0922;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 4, 5, 2, 7 }, solution.sortArrayByParityII(new int[] { 4, 2, 5, 7 }));

        assertArrayEquals(new int[] { 2, 3 }, solution.sortArrayByParityII(new int[] { 2, 3 }));

        assertArrayEquals(new int[] { 4, 1, 2, 1 }, solution.sortArrayByParityII(new int[] { 4, 1, 2, 1 }));

        assertArrayEquals(new int[] { 888, 505, 846, 627 }, solution.sortArrayByParityII(new int[] { 888, 505, 627, 846 }));
    }
}
