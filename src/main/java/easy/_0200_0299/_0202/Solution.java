package easy._0200_0299._0202;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> calculated = new HashSet<>();
        while (n != 1 && !calculated.contains(n)) {
            calculated.add(n);

            int sum = 0;
            while (n != 0) {
                sum += (n % 10) * (n % 10);
                n /= 10;
            }

            n = sum;
        }

        return n == 1;
    }
}
