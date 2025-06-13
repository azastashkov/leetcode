package easy._2500_2599._2582;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.passThePillow(4, 5));

        assertEquals(3, solution.passThePillow(3, 2));
    }
}
