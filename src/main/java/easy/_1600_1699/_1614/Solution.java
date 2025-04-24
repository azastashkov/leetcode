package easy._1600_1699._1614;

public class Solution {
    public int maxDepth(String s) {
        int l = s.length();
        int max = 0, count = 0;
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            if (c == '(') {
                count++;
                max = Math.max(max, count);
            } else if (c == ')') {
                count--;
            }
        }

        return max;
    }
}