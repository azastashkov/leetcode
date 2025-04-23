package easy._1500_1599._1560;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(Arrays.asList(1, 2), solution.mostVisited(4, new int[] { 1, 3, 1, 2 }));

        assertEquals(List.of(2), solution.mostVisited(2, new int[] { 2, 1, 2, 1, 2, 1, 2, 1, 2 }));

        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7), solution.mostVisited(7, new int[] { 1, 3, 5, 7 }));
    }
}
