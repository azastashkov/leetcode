package easy._0400_0499._0463;

public class Solution {
    public int islandPerimeter(int[][] grid) {
        int p = 0;
        int w = grid.length;
        int h = grid[0].length;

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                if (grid[i][j] == 1) {
                    p += 4;
                    if (i < w - 1 && grid[i + 1][j] == 1) {
                        p -= 2;
                    }
                    if (j < h - 1 && grid[i][j + 1] == 1) {
                        p -= 2;
                    }
                }
            }
        }

        return p;
    }
}
