package easy._0001_0099._0021;

import org.junit.Test;

import static easy.util.ListNodeUtil.fromArray;
import static easy.util.ListNodeUtil.toArray;
import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 1, 1, 2, 3, 4, 4 }, toArray(solution.mergeTwoLists(
                fromArray(new int[] { 1, 2, 4 }), fromArray(new int[] { 1, 3, 4 })
        )));

        assertArrayEquals(new int[] {}, toArray(solution.mergeTwoLists(
                fromArray(new int[] {}), fromArray(new int[] {})
        )));

        assertArrayEquals(new int[] { 0 }, toArray(solution.mergeTwoLists(
                fromArray(new int[] {}), fromArray(new int[] { 0 })
        )));

        assertArrayEquals(new int[] { 1, 2 }, toArray(solution.mergeTwoLists(
                fromArray(new int[] { 2 }), fromArray(new int[] { 1 })
        )));
    }
}
