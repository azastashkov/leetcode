package easy._2000_2099._2037;

import java.util.Arrays;

public class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);

        int moves = 0;
        for (int i = 0; i < seats.length; ++i) {
            moves += Math.abs(seats[i] - students[i]);
        }

        return moves;
    }
}