package easy._1500_1599._1572;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Solution {
    public int diagonalSum(int[][] mat) {
        int h = mat.length;
        int w = mat[0].length;

        int sum = 0;
        Set<Cell> visited = new HashSet<>();
        for (int r = 0, c = 0; r < h && c < w; r++, c++) {
            sum += mat[r][c];
            visited.add(new Cell(r, c));
        }

        for (int r = 0, c = w - 1; r < h && c >= 0; r++, c--) {
            Cell cell = new Cell(r, c);
            if (!visited.contains(cell)) {
                sum += mat[r][c];
            }
        }

        return sum;
    }

    private class Cell {
        private final int r;
        private final int c;

        Cell(int r, int c) {
            this.r = r;
            this.c = c;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Cell cell = (Cell) o;
            return r == cell.r && c == cell.c;
        }

        public int hashCode() {
            return Objects.hash(r, c);
        }
    }
}