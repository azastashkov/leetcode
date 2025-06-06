package easy._1500_1599._1544;

public class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (sb.isEmpty() || Math.abs(sb.charAt(sb.length() - 1) - c) != 32) {
                sb.append(c);
            } else {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }
}