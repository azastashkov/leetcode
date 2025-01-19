package easy._0001_0099._0067;

public class Solution {
    public String addBinary(String a, String b) {
        int i = a.length();
        int j = b.length();
        int carry = 0;

        StringBuilder sb = new StringBuilder();
        while (--i >= 0 | --j >= 0 || carry > 0) {
            int ai = i >= 0 ? a.charAt(i) - '0' : 0;
            int bj = j >= 0 ? b.charAt(j) - '0' : 0;
            carry += ai + bj;
            sb.append(carry % 2);
            carry /= 2;
        }

        return sb.reverse().toString();
    }
}
