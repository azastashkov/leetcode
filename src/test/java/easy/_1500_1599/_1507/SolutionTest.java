package easy._1500_1599._1507;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("2052-10-20", solution.reformatDate("20th Oct 2052"));

        assertEquals("1933-06-06", solution.reformatDate("6th Jun 1933"));

        assertEquals("1960-05-26", solution.reformatDate("26th May 1960"));
    }
}
