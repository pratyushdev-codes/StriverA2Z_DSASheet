public class HeightofBinaryTree {
    public static void main(String[] args) {
        
    }public int findTreeHeight(Node root){
        if(root==null){
            return 0;
        }

        int left = findTreeHeight(root.left);
        int right = findTreeHeight(root.right);

        return Math.max(left, right)+1;


    }
}
