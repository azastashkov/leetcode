package easy._2400_2499._2418;

import java.util.Objects;
import java.util.PriorityQueue;

public class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        PriorityQueue<Person> pq = new PriorityQueue<>();
        int l = names.length;
        for (int i = 0; i < l; i++) {
            pq.add(new Person(names[i], heights[i]));
        }

        for (int i = 0; i < l; i++) {
            names[i] = pq.remove().name;
        }

        return names;
    }

    private static class Person implements Comparable<Person> {
        String name;
        int height;

        public Person(String name, int height) {
            this.name = name;
            this.height = height;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return height == person.height && Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, height);
        }

        @Override
        public int compareTo(Person other) {
            return Integer.compare(other.height, this.height);
        }
    }
}