package easy._1800_1899._1859;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("This is a sentence", solution.sortSentence("is2 sentence4 This1 a3"));

        assertEquals("Me Myself and I", solution.sortSentence("Myself2 Me1 I4 and3"));
    }
}
