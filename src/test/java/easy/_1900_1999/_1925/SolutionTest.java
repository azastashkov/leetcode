package easy._1900_1999._1925;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.countTriples(5));

        assertEquals(4, solution.countTriples(10));
    }
}
