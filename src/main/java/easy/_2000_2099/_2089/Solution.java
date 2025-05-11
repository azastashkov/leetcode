package easy._2000_2099._2089;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);

        int l = nums.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < l; i++) {
            if (nums[i] == target) {
                list.add(i);
            }
        }

        return list;
    }
}