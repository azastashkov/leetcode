package easy._0400_0499._0495;

class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0) {
            return 0;
        }

        if (timeSeries.length == 1) {
            return duration;
        }

        int total = 0;

        for (int i = 1; i < timeSeries.length; i++) {
            int t0 = timeSeries[i - 1];
            int t1 = timeSeries[i];
            total += Math.min(duration, t1 - t0);
        }

        total += duration;

        return total;
    }
}