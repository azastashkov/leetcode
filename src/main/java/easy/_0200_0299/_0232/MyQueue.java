package easy._0200_0299._0232;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyQueue {
    private final Deque<Integer> s1 = new ArrayDeque<>();
    private final Deque<Integer> s2 = new ArrayDeque<>();

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        move();
        return s2.pop();
    }

    public int peek() {
        move();
        return s2.peek();
    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    private void move() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
    }
}
