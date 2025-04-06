package easy._0700_0799._0796;

class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.equals(goal)) {
            return true;
        }

        char[] sChars = s.toCharArray();
        char[] goalChars = goal.toCharArray();
        int l = sChars.length;
        int k = goalChars.length;
        if (l != k) {
            return false;
        }

        for (int i = 0; i < l; i++) {
            char tmp = sChars[l - 1];
            for (int m = l - 1; m > 0; m--) {
                sChars[m] = sChars[m - 1];
            }
            sChars[0] = tmp;

            boolean isShift = true;
            for (int j = 0; j < k; j++) {
                if (sChars[j] != goalChars[j]) {
                    isShift = false;
                    break;
                }
            }

            if (isShift) {
                return true;
            }
        }

        return false;
    }
}