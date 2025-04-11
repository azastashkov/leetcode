package easy._0900_0999._0929;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.numUniqueEmails(new String[] { "test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com" }));

        assertEquals(3, solution.numUniqueEmails(new String[] { "a@leetcode.com", "b@leetcode.com",
                "c@leetcode.com" }));

        assertEquals(2, solution.numUniqueEmails(new String[] { "linqmafia@leet+code.com", "linqmafia@code.com" }));

        assertEquals(2, solution.numUniqueEmails(new String[] { "a@e+c.com", "a@e+c+f.com" }));
    }
}
