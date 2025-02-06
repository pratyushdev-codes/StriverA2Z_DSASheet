// import java.util.ArrayList;
// import java.util.List;
// import java.util.PriorityQueue;
// import java.util.Queue;

// public class LevelOrderTraversal {
//     public static void main(String[] args) {

//     } public List<List<Integer>> levelOrder(TreeNode root) {
//         List<Integer> ans = new ArrayList<>();

//         if(root==null){
//             return;
//         }

//         Queue<TreeNode> q = new PriorityQueue<>();
//         q.add(root);

//         while(!q.isEmpty()){
//               List<Integer> level = new ArrayList<>();
//             TreeNode rem = q.poll();
//             level.add(temp.val);
//         }
//         if(rem.left!=null){
//             level.add(temp.left);
//         }

//         if(rem.right!=null){
//             level.add(temp.right);
//         }

//             ans.add(level);

//     }
//     return result;
// }

import java.util.Queue;

public class LevelOrderTraversal {

    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> q = new PriorityQueue<>();
        q.add(root);

        ArrayList<Integer> result = new ArrayList<>();

        while (!q.isEmpty()) {
            ArrayList<Integer> levels = new ArrayList<>();

            TreeNode temp = q.pop();
            levels.add(temp.val);

            if (temp.left != null) {
                levels.add(temp.left);
            }

            if (temp.right != null) {
                levels.add(temp.right);
            }
            result.add(levels);
        }

        return result;
    }
}
