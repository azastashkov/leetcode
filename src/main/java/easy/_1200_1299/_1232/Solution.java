package easy._1200_1299._1232;

public class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int l = coordinates.length;
        if (l <= 2) {
            return true;
        }

        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];
        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];


        for (int i = 2; i < l; i++) {
            int x = coordinates[i][0];
            int y = coordinates[i][1];
            if ((x - x1) * (y2 - y1) != (y - y1) * (x2 - x1)) {
                return false;
            }
        }

        return true;
    }
}