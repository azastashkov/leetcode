package easy._0900_0999._0942;

public class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int low = 0, high = n;
        int[] ans = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                ans[i] = low++;
            } else {
                ans[i] = high--;
            }
        }
        ans[n] = low;

        return ans;
    }
}
