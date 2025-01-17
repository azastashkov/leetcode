package easy._0028;

public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return -1;
        }

        char s = needle.charAt(0);

        int i = 0;
        for (; i < haystack.length() - needle.length() + 1; i++) {
            char c = haystack.charAt(i);
            boolean found;
            if (s == c) {
                found = true;
                int k = i + 1, j = 1;
                while (j < needle.length()) {
                    if (haystack.charAt(k) == needle.charAt(j)) {
                        k++;
                        j++;
                    } else {
                        found = false;
                        break;
                    }
                }

                if (found) {
                    return i;
                }
            }
        }

        return -1;
    }
}
