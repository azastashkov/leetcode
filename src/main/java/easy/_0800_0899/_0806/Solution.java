package easy._0800_0899._0806;

public class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        final int maxLineWidth = 100;
        int l = s.length();
        int lines = 1, last = 0;

        int lineWidth = 0;
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            int w = widths[c - 'a'];
            if (last + w <= maxLineWidth) {
                last += w;
            } else {
                lines++;
                last = w;
            }
        }

        return new int[] { lines, last };
    }
}
