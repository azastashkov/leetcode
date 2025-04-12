package easy._0900_0999._0976;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(5, solution.largestPerimeter(new int[] { 2, 1, 2 }));

        assertEquals(0, solution.largestPerimeter(new int[] { 1, 2, 1, 10 }));
    }
}
