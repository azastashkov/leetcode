package easy._0400_0499._0434;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(5, solution.countSegments("Hello, my name is John"));

        assertEquals(1, solution.countSegments("Hello"));

        assertEquals(0, solution.countSegments("             "));
    }
}
