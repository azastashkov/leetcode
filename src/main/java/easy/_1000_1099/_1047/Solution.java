package easy._1000_1099._1047;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public String removeDuplicates(String s) {
        int l = s.length();
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            if (stack.isEmpty() || c != stack.peek()) {
                stack.push(c);
            } else if (c == stack.peek()) {
                stack.pop();
            }
        }

        char[] chars = new char[stack.size()];
        for (int i = chars.length - 1; i >= 0; i--) {
            chars[i] = stack.pop();
        }

        return new String(chars);
    }
}