package easy._1500_1599._1518;

public class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count = numBottles;
        for (; numBottles >= numExchange; count++) {
            numBottles -= (numExchange - 1);
        }
        return count;
    }
}