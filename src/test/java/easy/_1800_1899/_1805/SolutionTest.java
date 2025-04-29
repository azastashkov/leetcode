package easy._1800_1899._1805;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.numDifferentIntegers("a123bc34d8ef34"));

        assertEquals(2, solution.numDifferentIntegers("leet1234code234"));

        assertEquals(1, solution.numDifferentIntegers("a1b01c001"));

        assertEquals(2, solution.numDifferentIntegers("035985750011523523129774573439111590559325a1554234973"));
    }
}
