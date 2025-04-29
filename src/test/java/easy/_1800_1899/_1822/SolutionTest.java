package easy._1800_1899._1822;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(1, solution.arraySign(new int[] { -1, -2, -3, -4, 3, 2, 1 }));

        assertEquals(0, solution.arraySign(new int[] { 1, 5, 0, 2, -3 }));

        assertEquals(-1, solution.arraySign(new int[] { -1, 1, -1, 1, -1 }));

        assertEquals(-1, solution.arraySign(new int[] { 41, 65, 14, 80, 20, 10, 55, 58, 24, 56, 28, 86, 96, 10, 3, 84, 4, 41, 13, 32, 42, 43, 83, 78, 82, 70, 15, -41 }));
    }
}
