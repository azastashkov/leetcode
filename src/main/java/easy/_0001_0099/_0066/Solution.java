package easy._0001_0099._0066;

public class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length;
        int carry = 1;

        while (--i >= 0 && carry != 0) {
            int digit = digits[i];
            int sum = digit + carry;
            carry = sum / 10;
            digits[i] = sum % 10;
        }

        if (carry > 0) {
            int[] expanded = new int[digits.length + 1];
            expanded[0] = carry;
            java.lang.System.arraycopy(digits, 0, expanded, 1, digits.length);
            return expanded;
        }

        return digits;
    }
}
