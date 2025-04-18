package easy._1300_1399._1313;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new LinkedList<>();
        int l = nums.length;
        for (int i = 0; i < l; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];
            list.addAll(Collections.nCopies(freq, val));
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}