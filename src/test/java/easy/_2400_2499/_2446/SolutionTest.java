package easy._2400_2499._2446;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.haveConflict(new String[] { "01:15", "02:00" }, new String[] { "02:00", "03:00" }));

        assertTrue(solution.haveConflict(new String[] { "01:00", "02:00" }, new String[] { "01:20", "03:00" }));

        assertFalse(solution.haveConflict(new String[] { "10:00", "11:00" }, new String[] { "14:00", "15:00" }));
    }
}
