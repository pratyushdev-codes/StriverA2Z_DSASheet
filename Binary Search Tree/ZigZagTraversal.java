import java.util.Collection;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class ZigZagTraversal {
    public static void main(String[] args) {
        
    }public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) return result;

    int flag = 0;
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);

    while (!q.isEmpty()) {
        int n = q.size();
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            TreeNode temp = q.poll();

            ans.add(temp.val); // Always add value

            if (temp.left != null) {
                q.add(temp.left);
            }

            if (temp.right != null) {
                q.add(temp.right);
            }
        }

        if (flag % 2 != 0) {
            Collections.reverse(ans);
        }

        result.add(ans);
        flag++;
    }

    return result;
}
}