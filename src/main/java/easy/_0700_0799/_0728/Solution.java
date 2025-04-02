package easy._0700_0799._0728;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>(right - left + 1);
        for (int n = left; n <= right; n++) {
            int k = n;
            boolean isSelfDividingNumber = true;
            while (k > 0) {
                int r = k % 10;
                if (r == 0 || n % r != 0) {
                    isSelfDividingNumber = false;
                    break;
                }
                k /= 10;
            }

            if (isSelfDividingNumber) {
                res.add(n);
            }
        }

        return res;
    }
}