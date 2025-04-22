package easy._1400_1499._1455;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(4, solution.isPrefixOfWord("i love eating burger", "burg"));

        assertEquals(2, solution.isPrefixOfWord("this problem is an easy problem", "pro"));

        assertEquals(-1, solution.isPrefixOfWord("i am tired", "you"));
    }
}
