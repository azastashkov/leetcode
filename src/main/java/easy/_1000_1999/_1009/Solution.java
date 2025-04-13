package easy._1000_1999._1009;

public class Solution {
    public int bitwiseComplement(int n) {
        if (n == 0) {
            return 1;
        }

        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int r = n % 2;
            int flip = r == 1 ? 0 : 1;
            sb.append(flip);
            n >>>= 1;
        }

        return Integer.parseInt(sb.reverse().toString(), 2);
    }
}