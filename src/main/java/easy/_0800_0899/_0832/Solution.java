package easy._0800_0899._0832;

public class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int h = image.length;
        int w = image[0].length;

        for (int r = 0; r < h; r++) {
            for (int lc = 0, rc = w - 1; lc <= rc; lc++, rc--) {
                int tmp = image[r][lc];
                image[r][lc] = invert(image[r][rc]);
                image[r][rc] = invert(tmp);
            }
        }

        return image;
    }

    private int invert(int i) {
        return i == 0 ? 1 : 0;
    }
}