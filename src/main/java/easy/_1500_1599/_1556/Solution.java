package easy._1500_1599._1556;

public class Solution {
    public String thousandSeparator(int n) {
        if (n == 0) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        int count = 0;
        while (n > 0) {
            int r = n % 10;
            sb.append(r);
            if (++count % 3 == 0) {
                sb.append('.');
            }
            n /= 10;
        }

        int l = sb.length();
        if (l > 0 && sb.charAt(l - 1) == '.') {
            sb.setLength(l - 1);
        }

        return sb.reverse().toString();
    }
}