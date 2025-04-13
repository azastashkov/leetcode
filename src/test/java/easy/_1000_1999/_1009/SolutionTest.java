package easy._1000_1999._1009;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.bitwiseComplement(5));

        assertEquals(0, solution.bitwiseComplement(7));

        assertEquals(5, solution.bitwiseComplement(10));

        assertEquals(0, solution.bitwiseComplement(1));
    }
}
