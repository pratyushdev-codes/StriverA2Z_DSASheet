// public class LCAofBinaryTree {
//     public static void main(String[] args) {
        
//     }public boolean traverse(TreeNode root , Treenode p , Treenode q){
//         if(root==null){
//             return false;
//         }

//         boolean left = traverse(root.left, p , q);
//         boolean right = traverse(root.right, p, q);


//         if(left && right || ((left || right)&& root=p))
//     }
// }


public class LCAofBinaryTree {

    public static void main(String[] args) {
        
    }    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        





    }public TreeNode LCATraverser(TreeNode root , Treenode p , TreeNode q){
        if(root==null || root==q || root==p){
            return root;
        }

        TreeNode left = LCATraverser(root.left, p ,q);
        TreeNode right = LCATraverser(root.right , p ,q);

        if(left!=null && right!=null){
            return root;// we found the LCA
        }
        else if(root.left==null){
            return right;
        }else{
            return left;

        }
    }
}