package easy._1700_1799._1779;

public class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int minDist = Integer.MAX_VALUE;
        int minIdx = -1;
        int i = 0;
        for (int[] p : points) {
            int px = p[0];
            int py = p[1];
            if (px == x || py == y) {
                int dist = Math.abs(px - x) + Math.abs(py - y);
                if (dist < minDist) {
                    minDist = dist;
                    minIdx = i;
                }
            }
            i++;
        }

        return minIdx;
    }
}