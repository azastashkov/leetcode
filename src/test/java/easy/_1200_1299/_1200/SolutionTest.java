package easy._1200_1299._1200;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        List<List<Integer>> list1 = new LinkedList<>();
        list1.add(List.of(1, 2));
        list1.add(List.of(2, 3));
        list1.add(List.of(3, 4));

        assertEquals(list1, solution.minimumAbsDifference(new int[] { 4, 2, 1, 3 }));

        List<List<Integer>> list2 = new LinkedList<>();
        list2.add(List.of(1, 3));

        assertEquals(list2, solution.minimumAbsDifference(new int[] { 1, 3, 6, 10, 15 }));

        List<List<Integer>> list3 = new LinkedList<>();
        list3.add(List.of(-14,-10));
        list3.add(List.of(19, 23));
        list3.add(List.of(23, 27));

        assertEquals(list3, solution.minimumAbsDifference(new int[] { 3, 8, -10, 23, 19, -4, -14, 27 }));
    }
}
