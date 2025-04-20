package easy._1300_1399._1356;

import java.util.PriorityQueue;

public class Solution {
    public int[] sortByBits(int[] arr) {
        PriorityQueue<Num> pq = new PriorityQueue<>();
        for (int n : arr) {
            pq.add(new Num(bitsSet(n), n));
        }

        int[] res = new int[pq.size()];
        int i = 0;
        while (!pq.isEmpty()) {
            res[i++] = pq.remove().n;
        }

        return res;
    }

    private int bitsSet(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                count++;
            }
            n >>>= 1;
        }

        return count;
    }

    private static class Num implements Comparable<Num> {
        int bitsSet;
        int n;

        Num(int bitsSet, int n) {
            this.bitsSet = bitsSet;
            this.n = n;
        }

        public int compareTo(Num other) {
            if (bitsSet > other.bitsSet) {
                return 1;
            } else if (bitsSet < other.bitsSet) {
                return -1;
            }

            if (n > other.n) {
                return 1;
            } else if (n < other.n) {
                return -1;
            }

            return 0;
        }
    }
}