package easy._1700_1799._1725;

public class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int maxLen = 0, count = 0;
        for (int[] rect : rectangles) {
            int l = rect[0];
            int h = rect[1];
            int squareSide = Math.min(l, h);
            if (squareSide > maxLen) {
                maxLen = squareSide;
                count = 1;
            } else if (squareSide == maxLen) {
                count++;
            }
        }

        return count;
    }
}