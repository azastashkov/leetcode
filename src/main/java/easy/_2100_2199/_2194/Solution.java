package easy._2100_2199._2194;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<String> cellsInRange(String s) {
        char c1 = s.charAt(0);
        char r1 = s.charAt(1);
        char c2 = s.charAt(3);
        char r2 = s.charAt(4);

        List<String> list = new LinkedList<>();
        for (char c = c1; c <= c2; c++) {
            for (char r = r1; r <= r2; r++) {
                String cell = c + "" + r;
                list.add(cell);
            }
        }

        return list;
    }
}