package easy._0500_0599._0551;

public class Solution {
    public boolean checkRecord(String s) {
        int absentDays = 0;
        int consecutiveLateDays = 0;
        int l = s.length();

        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            if (c == 'A') {
                absentDays++;
            }
            if (c == 'L') {
                int j = i;
                while (j >= Math.max(0, i - 2) && consecutiveLateDays < 3) {
                    if (s.charAt(j--) == 'L') {
                        consecutiveLateDays++;
                    }
                }
                if (consecutiveLateDays < 3) {
                    consecutiveLateDays = 0;
                }
            }
            if (absentDays >= 2 || consecutiveLateDays >= 3) {
                break;
            }
        }

        return absentDays < 2 && consecutiveLateDays < 3;
    }
}
