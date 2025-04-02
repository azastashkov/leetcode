package easy._0700_0799._0733;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        int w = image[0].length;
        int h = image.length;

        Queue<Integer> next = new LinkedList<>();
        next.add(sr);
        next.add(sc);

        while (!next.isEmpty()) {
            int r = next.remove();
            int c = next.remove();

            int cellColor = image[r][c];
            if (cellColor == color) {
                continue;
            }

            if (cellColor == originalColor) {
                image[r][c] = color;
            }

            if (r - 1 >= 0 && image[r - 1][c] == originalColor) {
                next.add(r - 1);
                next.add(c);
            }

            if (r + 1 < h && image[r + 1][c] == originalColor) {
                next.add(r + 1);
                next.add(c);
            }

            if (c - 1 >= 0 && image[r][c - 1] == originalColor) {
                next.add(r);
                next.add(c - 1);
            }

            if (c + 1 < w && image[r][c + 1] == originalColor) {
                next.add(r);
                next.add(c + 1);
            }
        }

        return image;
    }
}
