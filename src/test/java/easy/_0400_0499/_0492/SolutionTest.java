package easy._0400_0499._0492;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 2, 2 }, solution.constructRectangle(4));

        assertArrayEquals(new int[] { 37, 1 }, solution.constructRectangle(37));

        assertArrayEquals(new int[] { 427, 286 }, solution.constructRectangle(122122));
    }
}
