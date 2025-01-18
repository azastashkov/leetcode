package easy._0083;

import org.junit.Test;

import static easy.util.ListNodeUtil.fromArray;
import static easy.util.ListNodeUtil.toArray;
import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 1, 2 }, toArray(solution.deleteDuplicates(
                fromArray(new int[] { 1, 1, 2 }))));

        assertArrayEquals(new int[] { 1, 2, 3 }, toArray(solution.deleteDuplicates(
                fromArray(new int[] { 1, 1, 2, 3, 3 }))));

        assertArrayEquals(new int[] { 1 }, toArray(solution.deleteDuplicates(
                fromArray(new int[] { 1, 1, 1 }))));
    }
}
