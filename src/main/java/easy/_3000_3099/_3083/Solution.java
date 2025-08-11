package easy._3000_3099._3083;

public class Solution {
    public boolean isSubstringPresent(String s) {
        char[] chars = s.toCharArray();
        int l = chars.length;
        if (l < 2) {
            return false;
        }

        for (int i = 1; i < l; i++) {
            for (int j = l - 2; j >= 0; j--) {
                if (chars[i - 1] == chars[j + 1] && chars[i] == chars[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}