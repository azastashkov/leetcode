package easy._2100_2199._2129;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("Capitalize The Title", solution.capitalizeTitle("capiTalIze tHe titLe"));

        assertEquals("First Letter of Each Word", solution.capitalizeTitle("First leTTeR of EACH Word"));

        assertEquals("i Love Leetcode", solution.capitalizeTitle("i lOve leetcode"));
    }
}
