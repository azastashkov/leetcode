package easy._2200_2299._2293;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(1, solution.minMaxGame(new int[] { 1, 3, 5, 2, 4, 8, 2, 2 }));

        assertEquals(3, solution.minMaxGame(new int[] { 3 }));
    }
}
