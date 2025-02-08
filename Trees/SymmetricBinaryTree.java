public class SymmetricBinaryTree {
    public static void main(String[] args) {
        
    }  public boolean isSymmetric(TreeNode root) {
        if(root.left ==null && root.right==null){
            return true;
        }

        if(root==null) {
            return true;
        }



    }public boolean isMirror(TreeNode a , TreeNode b){
        if(a==null && b==null) return true;

        if(a==null || b==null) return false;

        return (a.val== b.val && isMirror(a.left, b.right) && isMirror(a.right, b.left));
    }
}
