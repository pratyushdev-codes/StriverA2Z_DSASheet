import javax.swing.tree.TreeNode;

public class maximumPathSum {
    public static void main(String[] args) {
        
    }public int maxPathSum(TreeNode root) {

            maxSum(root);
            return ans;)
         
                 int ans = Integer.MIN_VALUE;
    }public int maxSum(TreeNode root){

            if(root==null) return 0;

            int left = Math.max(0,maxSum(left, root))  ;
            int right = Math.max(0,maxSum(right, root)) ;

            ans = Math.max(ans, left+right+ root.val);
            return (left+right)+root.val;
    }
}
