package easy._0600_0699._0682;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String op : operations) {
            if ("+".equals(op)) {
                int a = stack.pop();
                int b = stack.peek();
                stack.push(a);
                stack.push(a + b);
            } else if ("D".equals(op)) {
                stack.push(stack.peek() * 2);
            } else if ("C".equals(op)) {
                stack.pop();
            } else {
                stack.push(Integer.valueOf(op));
            }
        }

        return stack.stream().mapToInt(Integer::intValue).sum();
    }
}
