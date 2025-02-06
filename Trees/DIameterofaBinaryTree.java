public class DIameterofaBinaryTree {
    // same as heigh of a Binary Tree
    int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        
        height(root);
        return ans;
    }
    
    int height(TreeNode node) {
        if(node == null) return 0;
        int lht = height(node.left);
        int rht = height(node.right);
        ans = Math.max(ans, lht + rht);
        return Math.max(lht, rht) + 1;
    }
}


