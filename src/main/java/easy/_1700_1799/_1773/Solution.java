package easy._1700_1799._1773;

import java.util.Iterator;
import java.util.List;

public class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (List<String> item : items) {
            Iterator<String> iterator = item.iterator();

            String type = iterator.next();
            String color = iterator.next();
            String name = iterator.next();

            if ("type".equals(ruleKey) && ruleValue.equals(type)) {
                count++;
            } else if ("color".equals(ruleKey) && ruleValue.equals(color)) {
                count++;
            } else if ("name".equals(ruleKey) && ruleValue.equals(name)) {
                count++;
            }
        }

        return count;
    }
}