package easy._2900_2999._2996;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(6, solution.missingInteger(new int[] { 1, 2, 3, 2, 5 }));

        assertEquals(15, solution.missingInteger(new int[] { 3, 4, 5, 1, 12, 14, 13 }));
    }
}
