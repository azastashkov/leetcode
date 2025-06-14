package easy._2600_2699._2652;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(21, solution.sumOfMultiples(7));

        assertEquals(40, solution.sumOfMultiples(10));

        assertEquals(30, solution.sumOfMultiples(9));
    }
}
