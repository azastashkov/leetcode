package easy._2800_2899._2833;

public class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l = moves.length();
        int leftMoves = 0, rightMoves = 0, anyDirectionMoves = 0;
        for (int i = 0; i < l; i++) {
            char c = moves.charAt(i);
            if (c == 'L') {
                leftMoves++;
            } else if (c == 'R') {
                rightMoves++;
            } else {
                anyDirectionMoves++;
            }
        }

        return anyDirectionMoves + Math.abs(leftMoves - rightMoves);
    }
}