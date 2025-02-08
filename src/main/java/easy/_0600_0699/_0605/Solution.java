package easy._0600_0699._0605;

public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int c = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1) {
                continue;
            }

            int j = i - 1, k = i + 1;

            boolean leftFree = false, rightFree = false;
            if (flowerbed[i] == 0) {
                if (j >= 0) {
                    if (flowerbed[j] == 0) {
                        leftFree = true;
                    }
                } else {
                    leftFree = true;
                }

                if (k < flowerbed.length) {
                    if (flowerbed[k] == 0) {
                        rightFree = true;
                    }
                } else {
                    rightFree = true;
                }
            }

            if (leftFree && rightFree) {
                flowerbed[i] = 1;
                c++;
            }
        }

        return c >= n;
    }
}
