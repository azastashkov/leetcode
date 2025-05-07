package easy._1900_1999._1929;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 1, 2, 1, 1, 2, 1 }, solution.getConcatenation(new int[] { 1, 2, 1 }));

        assertArrayEquals(new int[] { 1, 3, 2, 1, 1, 3, 2, 1 }, solution.getConcatenation(new int[] { 1, 3, 2, 1 }));
    }
}
