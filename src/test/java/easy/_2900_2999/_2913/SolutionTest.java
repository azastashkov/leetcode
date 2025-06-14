package easy._2900_2999._2913;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(15, solution.sumCounts(List.of(1, 2, 1)));

        assertEquals(3, solution.sumCounts(List.of(1, 1)));
    }
}
