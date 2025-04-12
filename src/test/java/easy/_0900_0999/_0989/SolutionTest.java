package easy._0900_0999._0989;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(Arrays.asList(1, 2, 3, 4), solution.addToArrayForm(new int[] { 1, 2, 0, 0 }, 34));

        assertEquals(Arrays.asList(4, 5, 5), solution.addToArrayForm(new int[] { 2, 7, 4 }, 181));

        assertEquals(Arrays.asList(1, 0, 2, 1), solution.addToArrayForm(new int[] { 2, 1, 5 }, 806));
    }
}
