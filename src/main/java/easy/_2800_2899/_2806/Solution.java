package easy._2800_2899._2806;

public class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int r = purchaseAmount % 10;
        int roundedAmount;
        if (r >= 5) {
            roundedAmount = purchaseAmount - r + 10;
        } else {
            roundedAmount = purchaseAmount - r;
        }

        return 100 - roundedAmount;
    }
}