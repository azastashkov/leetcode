package easy._0400_0499._0415;

public class Solution {
    public String addStrings(String num1, String num2) {
        int k = num1.length();
        int l = num2.length();

        StringBuilder sb = new StringBuilder();
        int i = k - 1, j = l - 1;
        int carry = 0;
        do {
            int m = i >= 0 ? num1.charAt(i) - '0' : 0;
            int n = j >= 0 ? num2.charAt(j) - '0' : 0;

            int sum = carry + m + n;
            int r = sum % 10;
            carry = sum / 10;

            sb.append(r);
        } while (carry > 0 | --i >= 0 | --j >= 0);

        return sb.reverse().toString();
    }
}
