package easy._0800_0899._0806;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[] widths1 = new int[] { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };

        assertArrayEquals(new int[] { 3, 60 }, solution.numberOfLines(widths1, "abcdefghijklmnopqrstuvwxyz"));

        int[] widths2 = new int[] { 4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };

        assertArrayEquals(new int[] { 2, 4 }, solution.numberOfLines(widths2, "bbbcccdddaaa"));
    }
}
