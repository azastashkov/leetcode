package easy._0800_0899._0836;

public class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1 = rec1[0];
        int y1 = rec1[1];
        int x2 = rec1[2];
        int y2 = rec1[3];

        int x3 = rec2[0];
        int y3 = rec2[1];
        int x4 = rec2[2];
        int y4 = rec2[3];

        return !(y3 >= y2 || y4 <= y1 || x3 >= x2 || x4 <= x1);
    }
}