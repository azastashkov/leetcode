package easy._2500_2599._2582;

public class Solution {
    public int passThePillow(int n, int time) {
        int i = 1, k = 1;
        while (time-- > 0) {
            i += k;
            if (i == 1 || i == n) {
                k = -k;
            }
        }

        return i;
    }
}