package easy._1400_1499._1450;

public class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int l = startTime.length;
        int count = 0;
        for (int i = 0; i < l; i++) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
                count++;
            }
        }

        return count;
    }
}