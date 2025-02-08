import java.util.ArrayList;

class Pair{
    Node left;
    Node right;
    int Data;

    Pair(int Val){
        this.Data=Data;
        right= null;
        left= null;
    }
}

public class RoottoNodePathSum {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> curr =new ArrayList<>();

        
    }    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
     
    }public ArrayList<Integer> findPaths(Node root, ArrayList<Integer> curr , ArrayList<ArrayList<Integer>> ans){
        if(root==null){
            return null;
        }
 
        curr.add(root.data);

        if(root.left==null && root.right==null){
            curr.add(new ArrayList<>(null));
        }else{
            findPaths(root.left , curr , ans);
            findPaths(root.right, curr, ans);
        }

        curr.remove(curr.size()-1);
    }
}
