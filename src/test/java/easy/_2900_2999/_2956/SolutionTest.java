package easy._2900_2999._2956;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 2, 1 }, solution.findIntersectionValues(new int[] { 2, 3, 2 }, new int[] { 1, 2 }));

        assertArrayEquals(new int[] { 3, 4 }, solution.findIntersectionValues(new int[] { 4, 3, 2, 3, 1 }, new int[] { 2, 2, 5, 2, 3, 6 }));

        assertArrayEquals(new int[] { 0, 0 }, solution.findIntersectionValues(new int[] { 3, 4, 2, 3 }, new int[] { 1, 5 }));
    }
}
