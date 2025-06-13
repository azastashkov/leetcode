package easy._2600_2699._2600;

public class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum = 0;
        while (k-- > 0) {
            if (numOnes > 0) {
                numOnes--;
                sum += 1;
            } else if (numZeros > 0) {
                numZeros--;
            } else if (numNegOnes > 0) {
                numNegOnes--;
                sum -= 1;
            }
        }

        return sum;
    }
}