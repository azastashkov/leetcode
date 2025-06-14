package easy._2800_2899._2859;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(13, solution.sumIndicesWithKSetBits(List.of(5, 10, 1, 5, 2), 1));

        assertEquals(1, solution.sumIndicesWithKSetBits(List.of(4, 3, 2, 1), 2));
    }
}
