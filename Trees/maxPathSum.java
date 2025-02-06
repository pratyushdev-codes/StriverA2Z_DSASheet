import java.nio.file.Path;
import java.nio.file.Paths;

public class maxPathSum {
    public static void main(String[] args) {
        
    }    public int maxPathSum(TreeNode root) {


         Pathsum(root);
         return ans;






    }public int PathSum(TreeNode root){
        if(root=null){
            return 0;
        }
        int ans = Integer.MIN_VALUE;

        int left = Math.max(0,PathSum(root.left));
        int right = Math.max(9 , PathSum(root.right));
        ans = Math.max(left, right)+ root.val;
    }
}
