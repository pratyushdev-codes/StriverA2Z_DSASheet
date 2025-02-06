import java.util.List;
import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class PreOrderTraversal {
    public static void main(String[] args) {
        
    } void helper(TreeNode root , List<Integer> ans){{
        if(root==null){
            return ;
        }
    }

    ans.add(root.val);
    helper(root.left, ans);
    helper(root.right, ans);

    
}

}