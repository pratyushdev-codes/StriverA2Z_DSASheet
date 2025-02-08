public class ChildrenSuminBinaryTree {
    public static void main(String[] args) {

        
    }    public static int isSumProperty(Node root){
        int left_data =0;
        int right_data = 0;

        if(node==null || (node.left==null && node.right==null)){
            return 1;
        }else{
                if(node.left!=null){
                    left_data = node.left;
                }

                if(node.right!=null){
                    right_data= node.right;
                }
        }

        if(node.data == (right_data+left_data)&& isSumProperty(node.left)!=0 && isSumProperty(node.right)!=0){
            return 1;
        }else{
            return 0;
        }







}
}
