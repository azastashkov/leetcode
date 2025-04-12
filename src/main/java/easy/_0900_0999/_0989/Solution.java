package easy._0900_0999._0989;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new LinkedList<>();
        for (int i = num.length - 1; i >= 0 || k > 0; i--) {
            k += (i >= 0 ? num[i] : 0);
            ans.addFirst(k % 10);
            k /= 10;
        }
        return ans;
    }
}
