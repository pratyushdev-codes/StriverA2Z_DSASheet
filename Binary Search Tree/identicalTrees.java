import javax.swing.tree.TreeNode;

public class identicalTrees {
    public static void main(String[] args) {
        
    }public boolean isSameTree(TreeNode p, TreeNode q) {
            if(p==null && q==null){
                return null;
            }


            if(p==null || q==null || p.val!=q.val){
                return false;
            }

            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
