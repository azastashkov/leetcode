package easy._2500_2599._2549;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(4, solution.distinctIntegers(5));

        assertEquals(2, solution.distinctIntegers(3));
    }
}
