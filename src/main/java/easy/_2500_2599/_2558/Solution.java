package easy._2500_2599._2558;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int g : gifts) {
            pq.add(g);
        }

        int i = 0;
        while (i < k) {
            Integer max = pq.poll();
            pq.add((int)Math.sqrt(max));
            i++;
        }

        int sum = 0;
        while (!pq.isEmpty()) {
            sum += pq.poll();
        }

        return sum;
    }
}