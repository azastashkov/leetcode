package easy._1800_1899._1812;

public class Solution {
    public boolean squareIsWhite(String coordinates) {
        int letter = coordinates.charAt(0) - 'a' + 1;
        int digit = coordinates.charAt(1) - '0';

        return isEven(digit) && isOdd(letter) || isEven(letter) && isOdd(digit);
    }

    private boolean isEven(int n) {
        return n % 2 == 0;
    }

    private boolean isOdd(int n) {
        return n % 2 == 1;
    }
}