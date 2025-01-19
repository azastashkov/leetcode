package easy._0001_0099._0020;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.offerFirst(c);
            } else {
                Character t = stack.pollFirst();
                if (t == null) {
                    return false;
                }

                if (c == ')' && t != '(') {
                    return false;
                } else if (c == '}' && t != '{') {
                    return false;
                } else if (c == ']' && t != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
