package easy._2500_2599._2566;

public class Solution {
    public int minMaxDifference(int num) {
        String s = Integer.toString(num);
        int l = s.length();
        String max = s;
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            if (c != '9') {
                max = s.replace(c, '9');
                break;
            }
        }

        String min = s;
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            if (c != '0') {
                min = s.replace(c, '0');
                break;
            }
        }

        return Integer.parseInt(max) - Integer.parseInt(min);
    }
}