package easy._2800_2899._2843;

public class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            String num = Integer.toString(i);
            int l = num.length();
            if (l % 2 == 0) {
                if (isSymmetric(num, l)) {
                    count++;
                }
            }
        }

        return count;
    }

    private boolean isSymmetric(String num, int l) {
        int i = 0, j = l - 1;
        int si = 0, sj = 0;
        while (i < j) {
            char ci = num.charAt(i);
            char cj = num.charAt(j);
            si += ci - '0';
            sj += cj - '0';
            i++;
            j--;
        }

        return si == sj;
    }
}