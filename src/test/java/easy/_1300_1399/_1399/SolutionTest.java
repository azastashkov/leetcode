package easy._1300_1399._1399;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(4, solution.countLargestGroup(13));

        assertEquals(2, solution.countLargestGroup(2));
    }
}
