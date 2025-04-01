package easy._0700_0799._0705;

import java.util.LinkedList;
import java.util.List;

public class MyHashSet {
    private final int size = 1000;
    private List[] array;

    public MyHashSet() {
        array = new LinkedList[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = new LinkedList<Integer>();
        }
    }

    public void add(int key) {
        if (contains(key)) {
            return;
        }

        int index = hash(key);
        List<Integer> values = array[index];
        values.add(key);
    }

    public void remove(int key) {
        if (!contains(key)) {
            return;
        }

        int index = hash(key);
        List<Integer> values = array[index];
        values.remove(Integer.valueOf(key));
    }

    public boolean contains(int key) {
        int index = hash(key);
        List<Integer> values = array[index];
        for (int val : values) {
            if (val == key) {
                return true;
            }
        }

        return false;
    }

    private int hash(int key) {
        return key % size;
    }
}