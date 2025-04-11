package easy._0900_0999._0933;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
    private Queue<Integer> queue = new LinkedList<>();

    public int ping(int t) {
        queue.add(t);

        while (queue.peek() < t - 3000) {
            queue.remove();
        }

        return queue.size();
    }
}