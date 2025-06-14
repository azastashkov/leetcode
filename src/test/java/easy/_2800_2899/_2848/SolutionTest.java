package easy._2800_2899._2848;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        List<List<Integer>> nums1 = List.of(
                List.of(3, 6),
                List.of(1, 5),
                List.of(4, 7)
        );

        assertEquals(7, solution.numberOfPoints(nums1));

        List<List<Integer>> nums2 = List.of(
                List.of(1, 3),
                List.of(5, 8)
        );

        assertEquals(7, solution.numberOfPoints(nums2));
    }
}
