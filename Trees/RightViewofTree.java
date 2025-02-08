import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class RightViewofTree {
    public static void main(String[] args) {
        
    }   public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }

        Queue<Integer> q= new PriorityQueue<>();

        q.add(root);
        while(!q.isEmpty()){
            Node rem = q.remove();

             int n = q.size();
             for(int i = 0 ; i< n ; i++){
                if(i ==n-1){
                  ans.add(rem.val);
                }else if(rem.left!=null){
                    q.add(rem.left);
                    
                }else if(rem.right!=null){
                    q.add(rem.right);
                }
             }
        }

        return ans;
        



    }

}
