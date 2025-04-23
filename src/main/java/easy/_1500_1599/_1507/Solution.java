package easy._1500_1599._1507;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String reformatDate(String date) {
        final String[] months = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        int i = 1;
        Map<String, String> m = new HashMap<>();
        for (String month : months) {
            m.put(month, String.format("%02d", i++));
        }

        String[] parts = date.split(" ");
        String yyyy = parts[2];
        String mm = m.get(parts[1]);

        String ddd = parts[0];
        String dd = String.format("%02d", Integer.parseInt(ddd.substring(0, ddd.length() - 2)));

        return yyyy + "-" + mm + "-" + dd;
    }
}