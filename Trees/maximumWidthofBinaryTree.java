import java.util.Queue;

class TreeNode{
    Node right;
    Node left;
    int val;

    TreeNode(int val , Node right , Node left){
        this.val = val;
        this.right = right;
        this.left= left;
    }
}


class Pair{
    TreeNode node;
    int num;
    Pair(TreeNode _node , int _num){
        this.node= _node;
        this.num= _num;
    }
}
public class maximumWidthofBinaryTree {
    public static void main(String[] args) {

        
    }public int widthofBinaryTree(TreeNode root){
        if(root==null){
            return 0;
        }

        int ans = 0;

        Queue<Pair> q = new LinkedList<>();

        q.offer(new Pair(root, 0));

        while(!q.isEmpty()){
            int size= q.size();
            int mmin = q.peek().num;
            int first = 0; int last =0;
            for(int i =0; i<size; i++){
                int curr_id= q.peek().num-mmin;
                TreeNode node = q.peek().node;
                q.poll();
                if(i==0) first = curr_id;
                if(i==size-1) last= curr_id;

                if(node.left!=null){
                    q.offer(new Pair(node.left , curr_id*2+1));
                }
                if(node.right!=null){
                    q.offer(new Pair(node.right, curr_id*2+2));
                }

                ans = Math.max(ans , last-first+1);
            }

            return ans;
        }
    }
}
