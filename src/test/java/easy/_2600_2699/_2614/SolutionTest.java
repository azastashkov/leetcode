package easy._2600_2699._2614;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] nums1 = new int[][] {
                { 1, 2, 3 },
                { 5, 6, 7 },
                { 9, 10, 11 }
        };

        assertEquals(11, solution.diagonalPrime(nums1));

        int[][] nums2 = new int[][] {
                { 1, 2, 3 },
                { 5, 17, 7 },
                { 9, 11, 10 }
        };

        assertEquals(17, solution.diagonalPrime(nums2));
    }
}
