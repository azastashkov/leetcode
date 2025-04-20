package easy._1300_1399._1346;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> s = new HashSet<>();
        for (int x : arr) {
            if (s.contains(x * 2) || (x % 2 == 0 && s.contains(x / 2))) {
                return true;
            }
            s.add(x);
        }
        return false;
    }
}