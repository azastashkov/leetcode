package easy._0500_0599._0504;

public class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }

        if (num < 0) {
            return "-" + convertToBase7(-num);
        }

        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            sb.append(num % 7);
            num /= 7;
        }

        return sb.reverse().toString();
    }
}
