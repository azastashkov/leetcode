package easy._2900_2999._2928;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.distributeCandies(5, 2));

        assertEquals(10, solution.distributeCandies(3, 3));
    }
}
