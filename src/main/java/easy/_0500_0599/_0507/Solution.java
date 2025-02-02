package easy._0500_0599._0507;

public class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }

        int i = 2, sum = 1;
        while (i <= num / i) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
            i++;
        }

        return sum == num;
    }
}
