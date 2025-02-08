package easy._0500_0599._0590;

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

        assertEquals(Arrays.asList(5, 6, 3, 2, 4, 1), solution.postorder(root1));

        Integer[] array2 = { 1, null, 2, 3, 4, 5, null, null, 6, 7, null, 8, null, 9, 10, null, null, 11, null, 12, null, 13, null, null, 14 };
        Node root2 = fromArray(array2);

        assertEquals(Arrays.asList(2, 6, 14, 11, 7, 3, 12, 8, 4, 13, 9, 10, 5, 1), solution.postorder(root2));
    }
}
