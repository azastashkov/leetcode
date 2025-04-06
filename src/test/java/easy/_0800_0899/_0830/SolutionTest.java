package easy._0800_0899._0830;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        List<List<Integer>> expected1 = Collections.singletonList(Arrays.asList(3, 6));

        assertEquals(expected1, solution.largeGroupPositions("abbxxxxzzy"));

        List<List<Integer>> expected2 = Collections.emptyList();

        assertEquals(expected2, solution.largeGroupPositions("abc"));

        List<List<Integer>> expected3 = Arrays.asList(Arrays.asList(3, 5), Arrays.asList(6, 9), Arrays.asList(12, 14));

        assertEquals(expected3, solution.largeGroupPositions("abcdddeeeeaabbbcd"));

        List<List<Integer>> expected4 = Collections.singletonList(Arrays.asList(0, 2));

        assertEquals(expected4, solution.largeGroupPositions("aaa"));

        List<List<Integer>> expected5 = Arrays.asList(Arrays.asList(3, 6), Arrays.asList(7, 9));

        assertEquals(expected5, solution.largeGroupPositions("babaaaabbb"));
    }
}
