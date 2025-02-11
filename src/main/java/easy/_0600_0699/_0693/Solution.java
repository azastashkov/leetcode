package easy._0600_0699._0693;

public class Solution {
    public boolean hasAlternatingBits(int n) {
        int previous = -1;
        while (n > 0) {
            int current = n & 1;
            if (current == previous) {
                return false;
            }
            previous = current;
            n >>>= 1;
        }

        return true;
    }
}
