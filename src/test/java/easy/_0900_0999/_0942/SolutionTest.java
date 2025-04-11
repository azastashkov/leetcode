package easy._0900_0999._0942;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 0, 4, 1, 3, 2 }, solution.diStringMatch("IDID"));

        assertArrayEquals(new int[] { 0, 1, 2, 3 }, solution.diStringMatch("III"));

        assertArrayEquals(new int[] { 3, 2, 0, 1 }, solution.diStringMatch("DDI"));
    }
}
