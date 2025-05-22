package easy._2200_2299._2220;

public class Solution {
    public int minBitFlips(int start, int goal) {
        int flips = 0;
        while (goal > 0 || start > 0) {
            int gr = goal % 2;
            int sr = start % 2;
            if (sr != gr) {
                flips++;
            }
            goal >>>= 1;
            start >>>= 1;
        }

        return flips;
    }
}