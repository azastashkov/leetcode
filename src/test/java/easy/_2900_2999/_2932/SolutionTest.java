package easy._2900_2999._2932;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(7, solution.maximumStrongPairXor(new int[] { 1, 2, 3, 4, 5 }));

        assertEquals(0, solution.maximumStrongPairXor(new int[] { 10, 100 }));

        assertEquals(7, solution.maximumStrongPairXor(new int[] { 5, 6, 25, 30 }));
    }
}
