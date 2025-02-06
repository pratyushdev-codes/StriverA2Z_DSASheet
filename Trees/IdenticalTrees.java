public class IdenticalTrees {
    public static void main(String[] args) {
        
    }    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p==null && q==null){
            return true;
        }

        if(p==null || q==null || q.val!=p.val){
            return false;
        }


        return isSameTree(p.left, q.left) && isSameTree(p.right, p.right);



    }
}
