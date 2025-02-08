import java.util.ArrayList;

public class RoottoLeaf {
    public static void main(String[] args) {
        
    }    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        if(root==null){
            return null;
        }

        List<String> a1= new ArrayList<>();

       


         countPaths(root, a1,s);
         return a1;

        





    }public void countPaths(Node root, List<String> a1, String s){

        if(root==null){
            return;
        }

        if(root.left==null && root.right ==null){
            a1.add(s+ root.val);
            return;
        }


        countPaths(root.left, a1, root.val+ "->");
        countPaths(root.right , a1. root.val + "->");

        

        // int left = 1+ countPaths(root.left);
        // int right = 1+ countPaths(root.right);

        // return left+right;
    }
}
