import javax.swing.tree.TreeNode;

public class DiameterofBinaryTree {
        public int ans =0;
      public static void main(String[] args) {
  
    }public int diameterOfBinaryTree(TreeNode root) {
            height(root);
            return ans;

    }public int height(TreeNode root){

            if(root==null){
                return 0;
            }

            int left = height(root.left);
            int right = height(root.right);
            ans = Math.max(ans , left+right);
            return 1+ Math.max(left,right);



    }
}
