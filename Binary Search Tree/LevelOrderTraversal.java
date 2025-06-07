import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        
    }public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();

            if(root==null) return result;

            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);

            while(q.isEmpty()){
                int n = q.size();
                List<Integer> list = new ArrayList<>();
                for(int i =0 ; i < n ; i++){

                    TreeNode temp = q.poll();
                    list.add(temp.val);

                    if(temp..left!=null){
                        q.add(temp.left);
                    }
                    if(temp.right!=null){
                        q.add(temp.right);
                    }
                }
                result.add(list);
            }
    }
}
