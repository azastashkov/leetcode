package easy._1500_1599._1598;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int minOperations(String[] logs) {
        Deque<String> stack = new ArrayDeque<>();
        for (String log : logs) {
            if (!stack.isEmpty() && "../".equals(log)) {
                stack.pop();
            } else if (!"./".equals(log) && !"../".equals(log)) {
                stack.push(log);
            }
        }

        return stack.size();
    }
}