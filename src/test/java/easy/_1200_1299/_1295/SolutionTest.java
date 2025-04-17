package easy._1200_1299._1295;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.findNumbers(new int[] { 12, 345, 2, 6, 7896 }));

        assertEquals(1, solution.findNumbers(new int[] { 555, 901, 482, 1771 }));
    }
}
