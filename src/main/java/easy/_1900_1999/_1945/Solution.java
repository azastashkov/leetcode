package easy._1900_1999._1945;

public class Solution {
    public int getLucky(String s, int k) {
        int l = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            int n = c - 'a' + 1;
            sb.append(n);
        }

        l = sb.length();
        int sum = 0;
        for (int i = 0; i < l; i++) {
            char c = sb.charAt(i);
            sum += (c - '0');
        }

        for (int i = 1; i < k; i++) {
            s = Integer.toString(sum);
            sum = 0;
            l = s.length();
            for (int j = 0; j < l; j++) {
                char c = s.charAt(j);
                sum += (c - '0');
            }
        }

        return sum;
    }
}