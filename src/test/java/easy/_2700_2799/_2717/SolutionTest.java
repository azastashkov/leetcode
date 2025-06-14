package easy._2700_2799._2717;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.semiOrderedPermutation(new int[] { 2, 1, 4, 3 }));

        assertEquals(3, solution.semiOrderedPermutation(new int[] { 2, 4, 1, 3 }));

        assertEquals(0, solution.semiOrderedPermutation(new int[] { 1, 3, 4, 2, 5 }));
    }
}
