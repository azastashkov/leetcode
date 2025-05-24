package easy._2200_2299._2248;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] nums1 = new int[][] {
                { 3, 1, 2, 4, 5 },
                { 1, 2, 3, 4 },
                { 3, 4, 5, 6 }
        };

        assertEquals(List.of(3, 4), solution.intersection(nums1));

        int[][] nums2 = new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        assertEquals(List.of(), solution.intersection(nums2));
    }
}
