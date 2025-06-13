package easy._2500_2599._2515;

public class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int ans = n;
        for (int i = 0; i < n; ++i) {
            String w = words[i];
            if (w.equals(target)) {
                int t = Math.abs(i - startIndex);
                ans = Math.min(ans, Math.min(t, n - t));
            }
        }

        return ans == n ? -1 : ans;
    }
}