package easy._0600_0699._0696;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int countBinarySubstrings(String s) {
        int i = 0, n = s.length();
        List<Integer> t = new ArrayList<>();
        while (i < n) {
            int cnt = 1;
            while (i + 1 < n && s.charAt(i) == s.charAt(i + 1)) {
                i++;
                cnt++;
            }
            t.add(cnt);
            i++;
        }

        int ans = 0;
        for (i = 1; i < t.size(); i++) {
            ans += Math.min(t.get(i - 1), t.get(i));
        }

        return ans;
    }
}