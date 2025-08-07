package easy._3000_3099._3079;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(6, solution.sumOfEncryptedInt(new int[] { 1, 2, 3 }));

        assertEquals(66, solution.sumOfEncryptedInt(new int[] { 10, 21, 31 }));
    }
}
