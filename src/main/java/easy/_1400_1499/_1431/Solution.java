package easy._1400_1499._1431;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int c : candies) {
            max = Math.max(max, c);
        }

        List<Boolean> list = new LinkedList<>();
        for (int c : candies) {
            if (c + extraCandies >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }

        return list;
    }
}