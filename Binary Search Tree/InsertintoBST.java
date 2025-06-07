import javax.swing.tree.TreeNode;

public class InsertintoBST {

    public static void main(String[] args) {
        
    } public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode n = new TreeNode(val);
        if(root==val){
            return n;
        }
        TreeNode ans = root;
        while (true) {
            if(root.val>val){
                if(root.left==null){
                    root.left= n;
                    return ans;
                }else{
                    root= root.left;
                }
            }
            
        }




    }
}