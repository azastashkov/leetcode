package easy._0600_0699._0637;

import org.junit.Test;
import util.TreeNode;

import java.util.Arrays;

import static easy.util.TreeNodeUtil.fromArray;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        TreeNode root1 = fromArray(new Integer[] { 3, 9, 20, null, null, 15, 7 });

        assertEquals(Arrays.asList(3d, 14.5, 11d), solution.averageOfLevels(root1));

        TreeNode root2 = fromArray(new Integer[] { 3, 9, 20, 15, 7 });

        assertEquals(Arrays.asList(3d, 14.5, 11d), solution.averageOfLevels(root2));
    }
}
