public class FlattenBinaryTreetoLL {
    public static void main(String[] args) {
        
    }    public TreeNode flatten(TreeNode root){
     
    }public TreeNode faltenner(TreeNode root){
        if(root==null) return null;

        TreeNode lt = faltenner(root.left);
        TreeNode rt = faltenner(root.right);

        if(lt== null && rt==null) return root;
        else if(lt!=null && rt==null) return rt;
        else if(lt!=null && rt==null){
            TreeNode lc = root.left;
            root.right=lc;
            root.left=null;
            return lt;
        }else{
            TreeNode lc = root.left;
            TreeNode rc= root.right;
            root.right= lc;
            root.left=null;
            lt.right= rc;
            return rt;
        }
    }
}
