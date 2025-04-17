package easy._1200_1299._1260;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] arr1 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        List<List<Integer>> exp1 = new LinkedList<>();
        exp1.add(List.of(9, 1, 2));
        exp1.add(List.of(3, 4, 5));
        exp1.add(List.of(6, 7, 8));

        assertEquals(exp1, solution.shiftGrid(arr1, 1));

        int[][] arr2 = new int[][] { { 3, 8, 1, 9 }, { 19, 7, 2, 5 }, { 4, 6, 11, 10 }, { 12, 0, 21, 13 } };

        List<List<Integer>> exp2 = new LinkedList<>();
        exp2.add(List.of(12, 0, 21, 13));
        exp2.add(List.of(3, 8, 1, 9));
        exp2.add(List.of(19, 7, 2, 5));
        exp2.add(List.of(4, 6, 11, 10));

        assertEquals(exp2, solution.shiftGrid(arr2, 4));

        int[][] arr3 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        List<List<Integer>> exp3 = new LinkedList<>();
        exp3.add(List.of(1, 2, 3));
        exp3.add(List.of(4, 5, 6));
        exp3.add(List.of(7, 8, 9));

        assertEquals(exp3, solution.shiftGrid(arr3, 9));
    }
}
