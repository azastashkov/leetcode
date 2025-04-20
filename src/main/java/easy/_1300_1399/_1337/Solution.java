package easy._1300_1399._1337;

import java.util.PriorityQueue;

public class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Row> pq = new PriorityQueue<>();

        int idx = 0;
        for (int[] r : mat) {
            pq.add(new Row(idx++, soldiersCount(r)));
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = pq.remove().idx;
        }

        return res;
    }

    private int soldiersCount(int[] row) {
        int i = 0;
        while (i < row.length && row[i] == 1) {
            i++;
        }

        return i;
    }

    private static class Row implements Comparable<Row> {
        int idx;
        int soldiers;

        public Row(int idx, int soldiers) {
            this.idx = idx;
            this.soldiers = soldiers;
        }

        public int compareTo(Row other) {
            if (soldiers > other.soldiers) {
                return 1;
            } else if (soldiers < other.soldiers) {
                return -1;
            }

            if (idx > other.idx) {
                return 1;
            } else if (idx < other.idx) {
                return -1;
            }

            return 0;
        }
    }
}