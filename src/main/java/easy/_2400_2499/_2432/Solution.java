package easy._2400_2499._2432;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int hardestWorker(int n, int[][] logs) {
        PriorityQueue<Employee> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int lastTaskStartTime = 0;
        int l = logs.length;
        for (int[] log : logs) {
            int id = log[0];
            int leaveTime = log[1];
            int timeSpent = leaveTime - lastTaskStartTime;
            lastTaskStartTime = leaveTime;
            pq.add(new Employee(id, timeSpent));
        }

        return pq.remove().id;
    }

    private static class Employee implements Comparable<Employee> {
        int id;
        int timeSpent;

        public Employee(int id, int timeSpent) {
            this.id = id;
            this.timeSpent = timeSpent;
        }

        @Override
        public int compareTo(Employee other) {
            if (timeSpent > other.timeSpent) {
                return 1;
            } else if (timeSpent < other.timeSpent) {
                return -1;
            }

            return Integer.compare(other.id, id);
        }
    }
}