package easy._2200_2299._2264;

public class Solution {
    public String largestGoodInteger(String num) {
        int l = num.length();
        if (l < 3) {
            return "";
        }

        int max = Integer.MIN_VALUE;
        for (int i = 2; i < l; i++) {
            int a = num.charAt(i - 2) - '0';
            int b = num.charAt(i - 1) - '0';
            int c = num.charAt(i) - '0';

            if (b == c && c == a) {
                max = Math.max(max, 100 * a + 10 * b + c);
            }
        }

        return max == Integer.MIN_VALUE ? "" : max == 0 ? "000" : Integer.toString(max);
    }
}