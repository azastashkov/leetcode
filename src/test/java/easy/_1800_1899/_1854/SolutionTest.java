package easy._1800_1899._1854;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] logs1 = new int[][] {
                { 1993, 1999 },
                { 2000, 2010 }
        };

        assertEquals(1993, solution.maximumPopulation(logs1));

        int[][] logs2 = new int[][] {
                { 1950, 1961 },
                { 1960, 1971 },
                { 1970, 1981 }
        };

        assertEquals(1960, solution.maximumPopulation(logs2));
    }
}
