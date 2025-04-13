package easy._1000_1999._1021;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public String removeOuterParentheses(String s) {
        int l = s.length();
        int p = 0;
        StringBuilder sb = new StringBuilder();
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            if (c == '(') {
                if (stack.isEmpty()) {
                    p++;
                }
                stack.push(c);
            } else if (c == ')') {
                stack.pop();
            }

            if (stack.isEmpty()) {
                sb.append(s, p, i);
                p = i + 1;
            }
        }

        return sb.toString();
    }
}