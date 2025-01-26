package easy._0300_0399._0374;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution1 = new Solution(6);

        assertEquals(6, solution1.guessNumber(10));

        Solution solution2 = new Solution(1);

        assertEquals(1, solution2.guessNumber(1));

        Solution solution3 = new Solution(1);

        assertEquals(1, solution3.guessNumber(2));

        Solution solution4 = new Solution(1702766719);

        assertEquals(1702766719, solution4.guessNumber(2126753390));
    }
}
