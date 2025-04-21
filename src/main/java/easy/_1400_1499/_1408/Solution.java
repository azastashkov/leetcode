package easy._1400_1499._1408;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> list = new LinkedList<>();
        int l = words.length;
        for (int i = 0; i < l; i++) {
            String wi = words[i];
            for (int j = 0; j < l; j++) {
                String wj = words[j];
                if (i != j && wj.contains(wi)) {
                    list.add(wi);
                    break;
                }
            }
        }

        return list;
    }
}