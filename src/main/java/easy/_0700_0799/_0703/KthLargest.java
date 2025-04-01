package easy._0700_0799._0703;

import java.util.PriorityQueue;

public class KthLargest {
    private PriorityQueue<Integer> minQ;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.minQ = new PriorityQueue<>(k);
        this.k = k;
        for (int i : nums) {
            add(i);
        }
    }

    public int add(int val) {
        minQ.add(val);
        if (minQ.size() > k) {
            minQ.poll();
        }
        return minQ.peek();
    }
}