package easy._2400_2499._2418;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new String[] { "Mary","Emma","John" },
                solution.sortPeople(new String[] { "Mary","John","Emma" }, new int[] { 180, 165, 170 }));

        assertArrayEquals(new String[] { "Bob", "Alice", "Bob" },
                solution.sortPeople(new String[] { "Alice", "Bob", "Bob" }, new int[] { 155, 185, 150 }));
    }
}
