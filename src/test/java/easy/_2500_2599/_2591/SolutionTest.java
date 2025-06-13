package easy._2500_2599._2591;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(1, solution.distMoney(20, 3));

        assertEquals(2, solution.distMoney(16, 2));
    }
}
