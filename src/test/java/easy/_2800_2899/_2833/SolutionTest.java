package easy._2800_2899._2833;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.furthestDistanceFromOrigin("L_RL__R"));

        assertEquals(5, solution.furthestDistanceFromOrigin("_R__LL_"));

        assertEquals(7, solution.furthestDistanceFromOrigin("_______"));
    }
}
