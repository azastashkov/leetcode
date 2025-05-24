package easy._2200_2299._2243;

public class Solution {
    public String digitSum(String s, int k) {
        int l = s.length();
        while (l > k) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < l; i += k) {
                int sum = 0;
                int end = Math.min(i + k, l);
                for (int j = i; j < end; j++) {
                    sum += (s.charAt(j) - '0');
                }
                sb.append(sum);
            }
            s = sb.toString();
            l = s.length();
        }

        return s;
    }
}