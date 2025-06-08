package easy._2300_2399._2389;

import java.util.Arrays;

public class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);

        int l = nums.length;
        int k = queries.length;
        int[] answer = new int[k];
        for (int i = 0; i < k; i++) {
            int sum = 0, j = 0;
            for (; j < l && sum + nums[j] <= queries[i]; j++) {
                sum += nums[j];
            }
            answer[i] = j;
        }

        return answer;
    }
}