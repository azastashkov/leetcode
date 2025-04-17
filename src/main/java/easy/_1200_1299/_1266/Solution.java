package easy._1200_1299._1266;

public class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int l = points.length;
        if (l <= 1) {
            return 0;
        }

        int t = 0;
        for (int p = 0; p < l - 1; p++) {
            int x = points[p][0];
            int y = points[p][1];
            int nx = points[p + 1][0];
            int ny = points[p + 1][1];
            int dx = Math.abs(nx - x);
            int dy = Math.abs(ny - y);
            int max = Math.max(dx, dy);
            t += max;
        }

        return t;
    }
}