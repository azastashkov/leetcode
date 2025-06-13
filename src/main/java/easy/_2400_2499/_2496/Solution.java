package easy._2400_2499._2496;

public class Solution {
    public int maximumValue(String[] strs) {
        int max = Integer.MIN_VALUE;
        for (String s : strs) {
            int l = s.length();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < l; i++) {
                char c = s.charAt(i);
                if (Character.isDigit(c)) {
                    sb.append(c);
                } else {
                    break;
                }
            }

            max = Math.max(max, sb.length() == l ? Integer.parseInt(sb.toString()) : l);
        }

        return max;
    }
}