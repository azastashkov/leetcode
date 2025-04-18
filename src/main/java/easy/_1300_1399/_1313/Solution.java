package easy._1300_1399._1313;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int l = nums.length;
        for (int i = 0; i < l; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];
            for (int j = 0; j < freq; j++) {
                list.add(val);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}