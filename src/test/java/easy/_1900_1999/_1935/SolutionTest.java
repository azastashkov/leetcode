package easy._1900_1999._1935;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(1, solution.canBeTypedWords("hello world", "ad"));

        assertEquals(1, solution.canBeTypedWords("leet code", "lt"));

        assertEquals(0, solution.canBeTypedWords("leet code", "e"));
    }
}
