package easy._0200_0299._0278;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution1 = new Solution() {
            @Override
            boolean isBadVersion(int version) {
                return version >= 4;
            }
        };

        assertEquals(4, solution1.firstBadVersion(5));

        Solution solution2 = new Solution() {
            @Override
            boolean isBadVersion(int version) {
                return version >= 1;
            }
        };

        assertEquals(1, solution1.firstBadVersion(1));
    }
}
