package easy._0500_0599._0557;

public class Solution {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();

        int i = 0, j = 0;
        for (; i < chars.length; i++) {
            char c = chars[i];
            if (c == ' ') {
                for (int k = i - 1; k > j; j++, k--) {
                    swap(chars, j, k);
                }
                j = i + 1;
            }
        }

        if (j < i) {
            for (int k = i - 1; k > j; j++, k--) {
                swap(chars, j, k);
            }
        }

        return new String(chars);
    }

    private void swap(char[] chars, int j, int k) {
        char t = chars[j];
        chars[j] = chars[k];
        chars[k] = t;
    }
}
