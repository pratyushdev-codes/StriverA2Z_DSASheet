import java.util.HexFormat;

public class SerializeandDeserializeBinaryTree {
    public static void main(String[] args) {
        
    }   public String serialize(TreeNode root) {


    }public void Helper1(TreeNode root , StringBuilder sb){
        //Serializing-- > ECoding into the tree
        if(root==null){
            sb.append("#");
            return;
        }
        sb.append(root.val + " ");
        Helper1(root.left, sb);
        Helper1(root.right, sb);

    }

    // decoding into a tree
    int i;
    public TreeNode deserialize(String data){
        String [] ch = data.split(" ");
        i=0;
        return Helper2(ch);
    }public TreeNode Helper2(String [] ch){
        if(ch[i].equals("#")){
            i++;
            return null;
        }

        TreeNode root - new TreeNode(Integer.parseInt(ch[i]));
        i++;
        root.left = Helper2(ch);
        root.right= Helper2(ch);
        return root;

    }
}
