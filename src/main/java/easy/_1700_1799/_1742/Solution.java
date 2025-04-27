package easy._1700_1799._1742;

import java.util.Arrays;

public class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] count = new int[50];
        for (int ball = lowLimit; ball <= highLimit; ball++) {
            int sum = 0, n = ball;
            while (n > 0) {
                int r = n % 10;
                sum += r;
                n /= 10;
            }
            count[sum]++;
        }

        return Arrays.stream(count).max().getAsInt();
    }
}