package easy._1800_1899._1893;

public class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        for (int i = left; i <= right; i++) {
            boolean covered = false;
            for (int[] range : ranges) {
                int start = range[0];
                int end = range[1];
                if (start <= i && i <= end) {
                    covered = true;
                    break;
                }
            }

            if (!covered) {
                return false;
            }
        }

        return true;
    }
}