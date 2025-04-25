package easy._1600_1699._1668;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.maxRepeating("ababc", "ab"));

        assertEquals(1, solution.maxRepeating("ababc", "ba"));

        assertEquals(0, solution.maxRepeating("ababc", "ac"));
    }
}
