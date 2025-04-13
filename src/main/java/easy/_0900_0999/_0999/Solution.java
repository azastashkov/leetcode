package easy._0900_0999._0999;

public class Solution {
    public int numRookCaptures(char[][] board) {
        int h = board.length;
        int w = board[0].length;

        for (int r = 0; r < h; r++) {
            for (int c = 0; c < w; c++) {
                if (board[r][c] == 'R') {
                    return countCaptures(board, r, c, h, w);
                }
            }
        }

        return 0;
    }

    private int countCaptures(char[][] board, int r, int c, int h, int w) {
        int count = 0;
        for (int i = r - 1; i >= 0; i--) {
            if (board[i][c] != '.') {
                if (board[i][c] == 'p') {
                    count++;
                }
                break;
            }
        }

        for (int i = r + 1; i < h; i++) {
            if (board[i][c] != '.') {
                if (board[i][c] == 'p') {
                    count++;
                }
                break;
            }
        }

        for (int i = c - 1; i >= 0; i--) {
            if (board[r][i] != '.') {
                if (board[r][i] == 'p') {
                    count++;
                }
                break;
            }
        }

        for (int i = c + 1; i < w; i++) {
            if (board[r][i] != '.') {
                if (board[r][i] == 'p') {
                    count++;
                }
                break;
            }
        }

        return count;
    }
}