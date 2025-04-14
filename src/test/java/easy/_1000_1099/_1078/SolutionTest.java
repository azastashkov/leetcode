package easy._1000_1099._1078;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        String text1 = "alice is a good girl she is a good student";

        assertArrayEquals(new String[] { "girl", "student" }, solution.findOcurrences(text1, "a", "good"));

        String text2 = "we will we will rock you";

        assertArrayEquals(new String[] { "we","rock" }, solution.findOcurrences(text2, "we", "will"));
    }
}
