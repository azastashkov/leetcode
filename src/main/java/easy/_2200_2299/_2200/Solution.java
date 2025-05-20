package easy._2200_2299._2200;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int l = nums.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if (Math.abs(i - j) <= k && nums[j] == key) {
                    list.add(i);
                    break;
                }
            }
        }

        return list;
    }
}