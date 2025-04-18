package easy._1200_1299._1299;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 18, 6, 6, 6, 1, -1 }, solution.replaceElements(new int[] { 17, 18, 5, 4, 6, 1 }));

        assertArrayEquals(new int[] { -1 }, solution.replaceElements(new int[] { 400 }));
    }
}
