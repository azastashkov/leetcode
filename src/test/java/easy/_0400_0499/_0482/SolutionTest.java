package easy._0400_0499._0482;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("5F3Z-2E9W", solution.licenseKeyFormatting("5F3Z-2e-9-w", 4));

        assertEquals("2-5G-3J", solution.licenseKeyFormatting("2-5g-3-J", 2));

        assertEquals("24A0-R74K", solution.licenseKeyFormatting("2-4A0r7-4k", 4));

        assertEquals("24-A0R-74K", solution.licenseKeyFormatting("2-4A0r7-4k", 3));

        assertEquals("AA-AA", solution.licenseKeyFormatting("--a-a-a-a--", 2));

        assertEquals("0-1-2-3-4-5-6-7-8-9", solution.licenseKeyFormatting("0123456789", 1));

        assertEquals("", solution.licenseKeyFormatting("---", 3));
    }
}
