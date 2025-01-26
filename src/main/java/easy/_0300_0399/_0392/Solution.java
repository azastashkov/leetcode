package easy._0300_0399._0392;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        int sl = s.length(), tl = t.length();
        while (i < sl && j < tl) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == sl;
    }
}
