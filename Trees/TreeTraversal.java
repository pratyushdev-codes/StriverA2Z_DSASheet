import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;
class TreeNde{
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){
        this.data= data;
    }
}
public class TreeTraversal {
    public static void main(String[] args) {
        
    }    public static List<List<Integer>> getTreeTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> inorder = new ArrayList<>();
        List<Integer> preorder = new ArrayList<>();
        List<Integer> postorder = new ArrayList<>();




    

    }private void inorder(TreeNode node , List<Integer> list){
        if(node==null){
            return;
        }

        inorder(node.left, list);
        inorder(node.data);
        inorder(node.right, list);
    }private void preOrder(TreeNode node , List<Integer> list){
        if(node==null){
            return ;
        }
        preOrder(node.data);
        preOrder(node.left, list);
        preOrder(node.right, list);

    }
}

