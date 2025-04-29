package easy._1800_1899._1837;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(9, solution.sumBase(34, 6));

        assertEquals(1, solution.sumBase(10, 10));
    }
}
