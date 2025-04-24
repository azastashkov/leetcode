package easy._1600_1699._1636;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] frequencySort(int[] nums) {
        int[] cnt = new int[201];
        List<Integer> t = new ArrayList<>();
        for (int v : nums) {
            v += 100;
            ++cnt[v];
            t.add(v);
        }

        t.sort((a, b) -> cnt[a] == cnt[b] ? b - a : cnt[a] - cnt[b]);

        int[] ans = new int[nums.length];
        int i = 0;
        for (int v : t) {
            ans[i++] = v - 100;
        }

        return ans;
    }
}
