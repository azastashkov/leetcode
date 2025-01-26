package easy._0300_0399._0374;

public class Solution extends GuessGame {
    public Solution(int pick) {
        super(pick);
    }

    public int guessNumber(int n) {
        int l = 1, h = n;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (guess(mid) < 0) {
                h = mid;
            } else if (guess(mid) > 0) {
                l = mid + 1;
            } else {
                return mid;
            }
        }
        return l;
    }
}
