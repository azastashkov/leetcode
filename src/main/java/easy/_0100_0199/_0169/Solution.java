package easy._0100_0199._0169;

class Solution {
    public int majorityElement(int[] nums) {
        int m = 0, cnt = 0;
        for (int num : nums) {
            if (cnt == 0) {
                m = num;
                cnt = 1;
            } else {
                cnt += m == num ? 1 : -1;
            }
        }
        return m;
    }
}