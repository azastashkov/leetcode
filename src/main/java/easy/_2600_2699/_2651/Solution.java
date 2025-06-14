package easy._2600_2699._2651;

public class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int t = arrivalTime + delayedTime;
        return t >= 24 ? t - 24 : t;
    }
}