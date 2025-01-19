package medium._0001_0099._0002;

import org.junit.Test;

import static easy.util.ListNodeUtil.fromArray;
import static easy.util.ListNodeUtil.toArray;
import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 7, 0, 8 }, toArray(solution.addTwoNumbers(
                fromArray(new int[] { 2, 4, 3 }), fromArray(new int[] { 5, 6, 4 })
        )));

        assertArrayEquals(new int[] { 0 }, toArray(solution.addTwoNumbers(
                fromArray(new int[] { 0 }), fromArray(new int[] { 0 })
        )));

        assertArrayEquals(new int[] { 8, 9, 9, 9, 0, 0, 0, 1 }, toArray(solution.addTwoNumbers(
                fromArray(new int[] { 9, 9, 9, 9, 9, 9, 9 }), fromArray(new int[] { 9, 9, 9, 9 })
        )));
    }
}
