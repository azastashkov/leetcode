package easy._0400_0499._0434;

public class Solution {
    public int countSegments(String s) {
        int l = s.length();
        if (l == 0) {
            return 0;
        }

        int seg = 0;
        boolean segStarted = false, segEnded = false;
        for (int i = 0; i < l; i++) {
            if (s.charAt(i) != ' ' && !segStarted) {
                segStarted = true;
            }

            if (s.charAt(i) == ' ' && segStarted) {
                segEnded = true;
            }

            if (segStarted && segEnded) {
                seg++;
                segStarted = false;
                segEnded = false;
            }
        }

        return segStarted && !segEnded ? seg + 1 : seg;
    }
}
