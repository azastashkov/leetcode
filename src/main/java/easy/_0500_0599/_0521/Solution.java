package easy._0500_0599._0521;

public class Solution {
    public int findLUSlength(String a, String b) {
        if (a == b || a.equals(b)) {
            return -1;
        }

        return Math.max(a.length(), b.length());
    }
}
