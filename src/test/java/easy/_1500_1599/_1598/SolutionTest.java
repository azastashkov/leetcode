package easy._1500_1599._1598;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.minOperations(new String[] { "d1/", "d2/", "../", "d21/", "./" }));

        assertEquals(3, solution.minOperations(new String[] { "d1/", "d2/", "./", "d3/", "../", "d31/" }));

        assertEquals(0, solution.minOperations(new String[] { "d1/", "../", "../", "../" }));

        assertEquals(0, solution.minOperations(new String[] { "./", "../", "./" }));
    }
}
