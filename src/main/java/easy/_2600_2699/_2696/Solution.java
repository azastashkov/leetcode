package easy._2600_2699._2696;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int minLength(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        stack.push(' ');
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if ((c == 'B' && stack.peek() == 'A') || (c == 'D' && stack.peek() == 'C')) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.size() - 1;
    }
}