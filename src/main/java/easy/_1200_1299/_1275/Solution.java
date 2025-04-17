package easy._1200_1299._1275;

public class Solution {
    public String tictactoe(int[][] moves) {
        int n = moves.length;
        if (n < 5) {
            return "Pending";
        }

        char[][] grid = new char[][] {
                { ' ', ' ', ' ' },
                { ' ', ' ', ' ' },
                { ' ', ' ', ' ' }
        };

        for (int i = 0; i < n; i++) {
            int[] m = moves[i];
            int r = m[0];
            int c = m[1];
            grid[r][c] = i % 2 == 0 ? 'A' : 'B';
        }

        if (won(grid, 'A')) {
            return "A";
        }

        if (won(grid, 'B')) {
            return "B";
        }

        if (n < 9) {
            return "Pending";
        }

        return "Draw";
    }

    public static boolean won(char[][] grid, char player) {
        for (int i = 0; i < 3; i++) {
            if (grid[i][0] == player && grid[i][1] == player && grid[i][2] == player) {
                return true;
            }
        }

        for (int j = 0; j < 3; j++) {
            if (grid[0][j] == player && grid[1][j] == player && grid[2][j] == player) {
                return true;
            }
        }

        if (grid[0][0] == player && grid[1][1] == player && grid[2][2] == player) {
            return true;
        }

        if (grid[0][2] == player && grid[1][1] == player && grid[2][0] == player) {
            return true;
        }

        return false;
    }
}