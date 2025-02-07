import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class ZigZagTraversalTrees {
    public static void main(String[] args) {
        // Modifications done were introdunced a flag variable, 0 - means asc and 1 - means desc
    }public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int flag= 0;
        Queue<TreeNode> q= new PriorityQueue<>();
        List<List<Integer>> ans = new ArrayList<>();

        if(root==null){
            return null;
        }
        q.offer(root);

        while(!q.isEmpty()){
            int currentLevel = q.size();

            List<Integer> level = new ArrayList<>();

            for(int = 0 ; i< currentLevel; i++){
                if(q.peek().left!=null){q.offer(q.peek().left)};
                if(q.peek().right!= null){q.offer(q.peek().right};
                level.add(q.poll().val);
                
            }

            if(flag%2==0){
                ans.add(level); // ascending order
            }else{
                Collections.reverse(level);
                ans.add(level);
            }

            flag++; //incsreasing flag after insertion 
        }
return ans;




    }
}
