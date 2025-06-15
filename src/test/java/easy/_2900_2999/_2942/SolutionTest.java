package easy._2900_2999._2942;

import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(List.of(0, 1), solution.findWordsContaining(new String[] { "leet", "code" }, 'e'));

        assertEquals(List.of(0, 2), solution.findWordsContaining(new String[] { "abc", "bcd", "aaaa", "cbc" }, 'a'));

        assertEquals(Collections.emptyList(), solution.findWordsContaining(new String[] { "abc", "bcd", "aaaa", "cbc" }, 'z'));
    }
}
