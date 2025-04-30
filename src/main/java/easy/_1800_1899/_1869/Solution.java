package easy._1800_1899._1869;

public class Solution {
    public boolean checkZeroOnes(String s) {
        int max1seg = 0, max0seg = 0;
        int seg1cnt = 0, seg0cnt = 0;

        int l = s.length();
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            if (c == '1') {
                seg1cnt++;
                max1seg = Math.max(max1seg, seg1cnt);
                seg0cnt = 0;
            } else {
                seg0cnt++;
                max0seg = Math.max(max0seg, seg0cnt);
                seg1cnt = 0;
            }
        }

        return max1seg > max0seg;
    }
}