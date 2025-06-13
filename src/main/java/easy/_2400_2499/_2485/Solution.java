package easy._2400_2499._2485;

public class Solution {
    public int pivotInteger(int n) {
        for (int x = 1; x <= n; ++x) {
            if ((1 + x) * x == (x + n) * (n - x + 1)) {
                return x;
            }
        }

        return -1;
    }
}