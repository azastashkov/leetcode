package easy._0800_0899._0860;

public class Solution {
    public boolean lemonadeChange(int[] bills) {
        final int lemonadeCost = 5;
        int fivesAvailable = 0, tensAvailable = 0, twentiesAvailable = 0;
        int remainder = -1;
        for (int bill : bills) {
            if (bill == 5) {
                fivesAvailable++;
            } else if (bill == 10) {
                tensAvailable++;
            } else if (bill == 20) {
                twentiesAvailable++;
            }

            remainder = bill - lemonadeCost;
            while (remainder > 0 && fivesAvailable > 0) {
                if (remainder >= 20 && twentiesAvailable > 0) {
                    remainder -= 20;
                    twentiesAvailable--;
                } else if (remainder >= 10 && tensAvailable > 0) {
                    remainder -= 10;
                    tensAvailable--;
                } else {
                    remainder -= 5;
                    fivesAvailable--;
                }
            }

            if (remainder > 0) {
                return false;
            }
        }

        return remainder == 0;
    }
}