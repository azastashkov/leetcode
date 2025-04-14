package easy._1100_1199._1103;

public class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] out = new int[num_people];

        int i = 0, total = i;
        while (total < candies) {
            out[i % num_people] += Math.min(i + 1, candies - total);
            total += ++i;
        }

        return out;
    }
}