import java.util.HashMap;

public class ConstructBinaryTreeforPreorderInorder {
    public static void main(String[] args) {
        
    }    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i = 0 ; i<n ; i++){
            map.put(inorder[i], i);
        }






    }public TreeNode construct(int [] pre, int ps , int pe , int [] in , int is , int ie){
        if(ps> pe || is>ie) return null;


        TreeNode root = new TreeNode(pre[ps]);
        int idx = map.get(pre[ps]);

        int count = idx-is;
        root.left = construct(pre , ps+1 , ps+count ; in ,is , idx-1);
        root.right = construct(pre, ps+count+1, pe, in, idx+1, ie);

        return root;

    }
}
