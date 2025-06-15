package easy._2900_2999._2942;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int l = words.length;
        List<Integer> list = new ArrayList<>(l);
        for (int i = 0; i < l; i++) {
            if (words[i].indexOf(x) >= 0) {
                list.add(i);
            }
        }

        return list;
    }
}