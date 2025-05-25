package easy._2200_2299._2273;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

//        assertEquals(Arrays.asList("abba", "cd"), solution.removeAnagrams(
//                new String[] { "abba", "baba", "bbaa", "cd", "cd" }));
//
//        assertEquals(Arrays.asList("a", "b", "c", "d", "e"),
//                solution.removeAnagrams(new String[] { "a", "b", "c", "d", "e" }));

        assertEquals(Arrays.asList("nelduncd", "fozlsvr", "dm", "eatzkewuyx", "a", "wulzacir"),
                solution.removeAnagrams(new String[] { "nelduncd", "dcnndeul", "uendlcnd",
                        "nluncedd", "fozlsvr", "osfvrlz", "vozsrfl", "dm", "md", "md", "dm",
                        "md", "dm", "md", "md", "dm", "dm", "dm", "dm", "md", "eatzkewuyx",
                        "a", "wulzacir" }));


    }
}
