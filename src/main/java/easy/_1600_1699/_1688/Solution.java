package easy._1600_1699._1688;

public class Solution {
    public int numberOfMatches(int n) {
        int total = 0;
        while (n > 1) {
            int matches;
            if (n % 2 == 0) {
                matches = n / 2;
                n = matches;
            } else {
                matches = (n - 1) / 2;
                n = matches + 1;
            }
            total += matches;
        }

        return total;
    }
}