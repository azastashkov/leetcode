package easy._2400_2499._2460;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 1, 4, 2, 0, 0, 0 }, solution.applyOperations(new int[] { 1, 2, 2, 1, 1, 0 }));

        assertArrayEquals(new int[] { 1, 0 }, solution.applyOperations(new int[] { 0, 1 }));
    }
}
