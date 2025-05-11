package easy._2000_2999._2073;

public class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int l = tickets.length, time = 0, i = 0;
        while (tickets[k] > 0) {
            int j = i % l;
            if (tickets[j] > 0) {
                tickets[j]--;
                time++;
            }
            i++;
        }

        return time;
    }
}