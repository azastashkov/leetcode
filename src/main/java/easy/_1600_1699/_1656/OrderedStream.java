package easy._1600_1699._1656;

import java.util.LinkedList;
import java.util.List;

public class OrderedStream {
    private final String[] arr;
    private int ptr;

    public OrderedStream(int n) {
        this.arr = new String[n + 1];
        this.ptr = 1;
    }

    public List<String> insert(int idKey, String value) {
        arr[idKey] = value;
        List<String> list = new LinkedList<>();
        while (ptr < arr.length && arr[ptr] != null) {
            list.add(arr[ptr]);
            ptr++;
        }

        return list;
    }
}