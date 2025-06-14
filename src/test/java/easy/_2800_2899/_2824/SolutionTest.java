package easy._2800_2899._2824;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.countPairs(List.of(-1, 1, 2, 3, 1), 2));

        assertEquals(10, solution.countPairs(List.of(-6, 2, 5, -2, -7, -1, 3), -2));
    }
}
