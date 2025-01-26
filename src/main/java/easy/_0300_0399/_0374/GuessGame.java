package easy._0300_0399._0374;

public class GuessGame {
    private final int pick;

    public GuessGame(int pick) {
        this.pick = pick;
    }

    int guess(int num) {
        if (num > pick) {
            return -1;
        } else if (num < pick) {
            return 1;
        } else {
            return 0;
        }
    }
}
