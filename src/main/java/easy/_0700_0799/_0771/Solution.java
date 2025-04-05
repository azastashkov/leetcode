package easy._0700_0799._0771;

public class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int n = jewels.length();
        int m = stones.length();

        int c = 0;
        for (int i = 0; i < n; i++) {
            char j = jewels.charAt(i);
            for (int k = 0; k < m; k++) {
                char s = stones.charAt(k);
                if (s == j) {
                    c++;
                }
            }
        }

        return c;
    }
}
