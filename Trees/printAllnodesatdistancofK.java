import java.util.*;

public class printAllnodesatdistancofK {
    public static void main(String[] args) {
        
    }public void makeParent(TreeNode root , HashMap<TreeNode , TreeNode> parent_track , TreeNode target){
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode current= q.peek();
            if(current.left!=null){
                q.offer(current.left);
                parent_track.put(current.left, current);
            }
            if(current.right!=null){
                q.add(current);
                parent_track.put(current.right, current);
            }
        }
    }public List<Integer> distanceK(TreeNode root , TreeNode target, int k){
        HashMap<TreeNode, TreeNode> parent_track = new HashMap<>();
        makeParent(root, parent_track, target);
        Map<TreeNode, Boolean> visited = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(target);
        visited.put(target, true);
        int curr_level = 0;
        while(!q.isEmpty()){
            int size = q.size();
            if(curr_level==k) break;
            // second bfs to count upto K levels
            curr_level++;

            for(int i = 0 ; i<size; i++){
                TreeNode current = q.poll();

                if(current.left!= null && visited.get(current.left)==null){
                    q.add(current.left);
                    visited.put(current.left, true);

                }

                if(current.right!=null && visited.get(current.right)==null){
                    q.add(current.right);
                    visited.put(current.right, true);
                }


                if(parent_track.get(current)!=null && visited.get(parent_track.get(current))==null){
                    q.offer(parent_track.get(current));
                    visited.put(parent_track.get(current), true);
                }
            }
        }
        List<Integer> result = new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode current = q.poll();
            result.add(current.val);
        }
        return result;
    }
}
