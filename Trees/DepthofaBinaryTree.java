public class DepthofaBinaryTree {
    public static void main(String[] args) {
        
    }
    
} public int maxDepth(TreeNode root) {
    if(root==null){
        return 0 ;
    }

    int height = 0;

    int right = maxDepth(root.right);
    int left = maxDepth(root.left);

    height= Math.max(right, left)+1;

    return height;



}
