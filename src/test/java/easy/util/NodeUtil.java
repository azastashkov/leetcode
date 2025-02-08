package easy.util;

import util.Node;

import java.util.ArrayDeque;
import java.util.Queue;

public class NodeUtil {
    public static Node fromArray(Integer[] values) {
        if (values == null || values.length == 0 || values[0] == null) {
            return null;
        }

        Node root = new Node(values[0]);

        if (values.length < 3) {
            return root;
        }

        Queue<Node> queue = new ArrayDeque<>(values.length);
        queue.add(root);

        int valPtr = 2;
        while (!queue.isEmpty()) {
            Node parent = queue.remove();

            Integer val;
            while (valPtr < values.length && (val = values[valPtr++]) != null) {
                Node child = new Node(val);
                parent.children.add(child);
                queue.add(child);
            }
        }

        return root;
    }
}
