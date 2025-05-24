package easy._2200_2299._2236;

import org.junit.Test;

import static easy.util.TreeNodeUtil.fromArray;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.checkTree(fromArray(new Integer[] { 10, 4, 6 })));

        assertFalse(solution.checkTree(fromArray(new Integer[] { 5, 3, 1 })));
    }
}
