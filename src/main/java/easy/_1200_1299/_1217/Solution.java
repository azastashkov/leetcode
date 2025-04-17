package easy._1200_1299._1217;

public class Solution {
    public int minCostToMoveChips(int[] position) {
        int a = 0;
        for (int p : position) {
            a += p % 2;
        }

        int b = position.length - a;

        return Math.min(a, b);
    }
}