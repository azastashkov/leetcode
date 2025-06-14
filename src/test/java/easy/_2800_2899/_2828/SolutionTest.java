package easy._2800_2899._2828;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.isAcronym(List.of("alice", "bob", "charlie"), "abc"));

        assertFalse(solution.isAcronym(List.of("an", "apple"), "a"));

        assertTrue(solution.isAcronym(List.of("never", "gonna", "give", "up", "on", "you"), "ngguoy"));
    }
}
