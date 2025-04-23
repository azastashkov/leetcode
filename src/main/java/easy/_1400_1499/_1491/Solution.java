package easy._1400_1499._1491;

public class Solution {
    public double average(int[] salary) {
        int l = salary.length;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int s : salary) {
            min = Math.min(min, s);
            max = Math.max(max, s);
        }

        double avg = 0;
        for (int s : salary) {
            if (s > min && s < max) {
                avg += s;
            }
        }
        avg /= (l - 2);

        return avg;
    }
}