public class countTotalNoCompleteNodes {

    public static void main(String[] args) {
       return  counter(root);
        
        
    }public int counter(TreeNode root){
        if(root==null){
            return 0;

        }

        int ls = counter(root.left);
        int rs = counter(root.right);

        return ls+rs+1;
    }}
