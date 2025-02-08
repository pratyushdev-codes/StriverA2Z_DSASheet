import java.util.*;

class Node {
    int val;
    Node left, right;

    Node(int x) {
        val = x;
        left = right = null;
    }
}

class Pair {
    Node n;
    int vlevel;

    Pair(Node node, int x) {
        this.n = node;
        this.vlevel = x;
    }
}

public class TopViewofaBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);

        ArrayList<Integer> result = topView(root);
        System.out.println(result);
    }

    public static ArrayList<Integer> topView(Node root) {
        if (root == null) return new ArrayList<>();

        Queue<Pair> q = new LinkedList<>();
        TreeMap<Integer, Integer> hm = new TreeMap<>();  // TreeMap keeps keys sorted

        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair rem = q.remove();
            Node remn = rem.n;
            int remVl = rem.vlevel;

            if (!hm.containsKey(remVl)) {
                hm.put(remVl, remn.val);
            }

            if (remn.left != null) {
                q.add(new Pair(remn.left, remVl - 1));
            }

            if (remn.right != null) {
                q.add(new Pair(remn.right, remVl + 1));
            }
        }

        return new ArrayList<>(hm.values());
    }
}
