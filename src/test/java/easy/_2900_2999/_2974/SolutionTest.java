package easy._2900_2999._2974;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 3, 2, 5, 4 }, solution.numberGame(new int[] { 5, 4, 2, 3 }));

        assertArrayEquals(new int[] { 5, 2 }, solution.numberGame(new int[] { 2, 5 }));
    }
}
