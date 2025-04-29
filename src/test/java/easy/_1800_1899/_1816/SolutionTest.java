package easy._1800_1899._1816;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("Hello how are you", solution.truncateSentence("Hello how are you Contestant", 4));

        assertEquals("What is the solution", solution.truncateSentence("What is the solution to this problem", 4));

        assertEquals("chopper is not a tanuki", solution.truncateSentence("chopper is not a tanuki", 5));
    }
}
