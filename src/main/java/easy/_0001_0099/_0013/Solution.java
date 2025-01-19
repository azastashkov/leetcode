package easy._0001_0099._0013;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        String romanDigits = "IVXLCDM";
        int[] romanDigitsValues = {1, 5, 10, 50, 100, 500, 1000};

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < romanDigits.length(); i++) {
            map.put(romanDigits.charAt(i), romanDigitsValues[i]);
        }

        int result = 0;
        int i = s.length() - 1;
        for (; i > 0; i--) {
            char c = s.charAt(i);
            char n = s.charAt(i - 1);
            int cv = map.get(c);
            int nv = map.get(n);
            if (cv > nv) {
                result += cv - nv;
                i--;
            } else {
                result += cv;
            }
        }

        if (i >= 0) {
            result += map.get(s.charAt(i));
        }

        return result;
    }
}
