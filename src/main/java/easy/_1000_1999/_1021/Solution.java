package easy._1000_1999._1021;

public class Solution {
    public String removeOuterParentheses(String s) {
        int l = s.length();
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            if (c == '(') {
                if (++count > 1) {
                    sb.append(c);
                }
            } else if (c == ')') {
                if (--count > 0) {
                    sb.append(c);
                }
            }
        }

        return sb.toString();
    }
}