package easy._1800_1899._1854;

public class Solution {
    public int maximumPopulation(int[][] logs) {
        final int offset = 1950;
        int[] d = new int[101];
        for (int[] log : logs) {
            int birth = log[0];
            int death = log[1];
            d[birth - 1950]++;
            d[death - 1950]--;
        }

        int max = 0, sum = 0, j = 0, l = d.length;
        for (int i = 0; i < l; i++) {
            sum += d[i];
            if (sum > max) {
                max = sum;
                j = i;
            }
        }

        return offset + j;
    }
}