package easy._2600_2699._2696;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.minLength("ABFCACDB"));

        assertEquals(5, solution.minLength("ACBBD"));
    }
}
