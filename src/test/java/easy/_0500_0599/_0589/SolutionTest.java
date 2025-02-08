package easy._0500_0599._0589;

import org.junit.Test;
import util.Node;

import java.util.Arrays;

import static easy.util.NodeUtil.fromArray;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        Integer[] array1 = { 1, null, 3, 2, 4, null, 5, 6 };
        Node root1 = fromArray(array1);

        assertEquals(Arrays.asList(1, 3, 5, 6, 2, 4), solution.preorder(root1));

        Integer[] array2 = { 1, null, 2, 3, 4, 5, null, null, 6, 7, null, 8, null, 9, 10, null, null, 11, null, 12, null, 13, null, null, 14 };
        Node root2 = fromArray(array2);

        assertEquals(Arrays.asList(1, 2, 3, 6, 7, 11, 14, 4, 8, 12, 5, 9, 13, 10), solution.preorder(root2));
    }
}
