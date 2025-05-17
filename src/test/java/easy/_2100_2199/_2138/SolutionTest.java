package easy._2100_2199._2138;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new String[] { "abc", "def", "ghi" }, solution.divideString("abcdefghi", 3, 'x'));

        assertArrayEquals(new String[] { "abc", "def", "ghi", "jxx" }, solution.divideString("abcdefghij", 3, 'x'));
    }
}
