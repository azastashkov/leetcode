package easy._2000_2999._2078;

public class Solution {
    public int maxDistance(int[] colors) {
        int l = colors.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                if (colors[i] != colors[j]) {
                    int d = j - i;
                    max = Math.max(max, d);
                }
            }
        }

        return max;
    }
}