package easy._2300_2399._2379;

public class Solution {
    public int minimumRecolors(String blocks, int k) {
        int l = blocks.length(), min = l;
        for (int i = 0; i <= l - k; i++) {
            int kMin = 0;
            for (int j = i; j < i + k; j++) {
                char c = blocks.charAt(j);
                if (c == 'W') {
                    kMin++;
                }
            }
            min = Math.min(min, kMin);
        }

        return min;
    }
}