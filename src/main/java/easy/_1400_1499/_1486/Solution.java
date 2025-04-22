package easy._1400_1499._1486;

public class Solution {
    public int xorOperation(int n, int start) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            res ^= start + (i << 1);
        }

        return res;
    }
}