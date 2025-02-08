package easy._0500_0599._0575;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int distributeCandies(int[] candyType) {
        int maxAllowed = candyType.length / 2;
        Set<Integer> uniqTypes = new HashSet<>();

        for (int t : candyType) {
            if (uniqTypes.size() < maxAllowed) {
                uniqTypes.add(t);
            } else {
                break;
            }
        }

        return uniqTypes.size();
    }
}
