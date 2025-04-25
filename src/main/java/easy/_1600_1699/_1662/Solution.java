package easy._1600_1699._1662;

import java.util.Objects;

public class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return Objects.equals(String.join("", word1), String.join("", word2));
    }
}