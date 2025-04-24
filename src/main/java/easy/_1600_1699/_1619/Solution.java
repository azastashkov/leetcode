package easy._1600_1699._1619;

import java.util.Arrays;

public class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);

        int l = arr.length;
        double sum = 0d;
        for (int start = (int) (l * 0.05), i = start; i < l - start; i++) {
            sum += arr[i];
        }

        return sum / (l * 0.9);
    }
}