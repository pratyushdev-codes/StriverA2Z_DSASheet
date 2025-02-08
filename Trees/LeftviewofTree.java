import java.util.ArrayList;
import java.util.Queue;

public class LeftviewofTree {
    public static void main(String[] args) {
        
    }public ArrayList<Integer> leftViewofTree(Node root){
        if(root==null){

            return null;
        }

        Queue<Integer> q = new ArrayList<>();


        ArrayList<Integer> ans = new ArrayList<>();

        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();

            for(int i = 0;i<n ; i++){
                Node temp = q.remove();

                if(i==1){ // this means this is the starting left most view of the tree
                    ans.add(temp.data);
                }if(temp.left!=null){
                    q.add(temp.left);
                }else if(temp.right!=null){
                    q.add(temp.right);
                }
            }
        }
        return ans;
    }
}
