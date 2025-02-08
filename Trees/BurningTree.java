

// // User function Template for Java

// class Solution {
//     /*class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             left = null;
//             right = null;
//         }
//     }*/

//     public static int minTime(Node root, int target) {
//         HashMap<Node, Node> parent = new HashMap<>();
//         Queue<Node> que = new LinkedList<>();
//         que.offer(root);
//         Node targetNode = null;
        
//         //this will give us a hashmap with child mapped to their parent.
//         while(!que.isEmpty()){
//             Node current = que.poll();
//             if(current.data == target) targetNode = current;  //fetching that node whose value is given target
//             if(current.left != null){
//                 parent.put(current.left, current);
//                 que.offer(current.left);
//             }
//             if(current.right != null){
//                 parent.put(current.right, current);
//                 que.offer(current.right);
//             }
//         } 
//         parent.put(root, null);  //putting this because it is not possible from above loop.
        
//         //to calculate time we have to burn every connected node, to do so we have to do bfs traversal and for that we need a visited hashset and a que to do bfs traversal. Every connected node to current node considered as a single level means a single second.
//         int time = 0;
//         HashSet<Node> vis = new HashSet<>();
//         vis.add(targetNode);
//         que.add(targetNode);
        
//         while(!que.isEmpty()){
//             int size = que.size();
//             for(int i = 0; i<size; i++){
//                 Node current = que.poll();
//                 //checking for its parent (upward direction)
//                 if(parent.get(current) != null && !vis.contains(parent.get(current))){
//                     vis.add(parent.get(current));
//                     que.add(parent.get(current));
//                 }
//                 //checking for its left child and right child(donward direction)
//                 if(current.left != null && !vis.contains(current.left)){
//                     vis.add(current.left);
//                     que.add(current.left);
//                 }
//                 if(current.right != null && !vis.contains(current.right)){
//                     vis.add(current.right);
//                     que.add(current.right);
//                 }
//             }
//             time++;
//         }
        
//         return time-1;
//     }
// }


public class BurningTree {

    public static void main(String[] args) {
        
    }    public static int minTime(Node root, int target) {
    
    }
}