package easy._2800_2899._2869;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(4, solution.minOperations(List.of(3, 1, 5, 4, 2), 2));

        assertEquals(5, solution.minOperations(List.of(3, 1, 5, 4, 2), 5));

        assertEquals(4, solution.minOperations(List.of(3, 2, 5, 3, 1), 3));
    }
}
