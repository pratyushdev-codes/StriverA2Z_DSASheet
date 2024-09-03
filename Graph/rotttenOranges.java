import java.util.*;
public class rotttenOranges {

    public static void main(String[] args) {
        
    }public class Solution{
        public class Pair{
            int row;
            int col ;
            int time;
            Pair(int row , int col , int time){
                this.row= row;
                this.col= col;
                this.time= time;
            }
        }public static int RottenOranges(int [][] grid){
            int m = grid.length;
            int n = grid[0].length;

            Queue<Pair> q= new LinkedList<>();

            int count1= 0 ;
            int count2= 0;
            
            for(int i = 0 ; i < m ; i++){
                for(int j =0 ; j < n ; j++){
                    if(grid[i][j]==2){
                        q.add(new Pair(i, j, 0));
                        count2++;
                    }else if(grid[i][j]==1){
                        q.add(new Pair(i, j, 0));
                        count1++;
                    }
                }if(count1 == 0){
					return 0;
				}else if(count2 == 0){
					return -1;
				}
                int ans = -1;

                while(!q.isEmpty()){
                    Pair rem = q.poll();
                    int crow = rem.row;
                    int ccol = rem.col;
                    int time = rem.time;
                    
                    ans = rem.time;
                    if(r + 1 < m && grid[r + 1][c] == 1 ) {
                        q.add(new Pair(r + 1, c, t + 1));
                        grid[r + 1][c] = 2;
                    }
                    if(r - 1 >= 0  && grid[r - 1][c] == 1 ) {
                        q.add(new Pair(r - 1, c, t + 1));
                        grid[r - 1][c] = 2;
                    }
                    if(c + 1 < n && grid[r][c + 1] == 1 ) {
                        q.add(new Pair(r , c + 1, t + 1));
                        grid[r][c + 1] = 2;
                    }
                    if(c - 1 >= 0 && grid[r][c - 1] == 1 ) {
                        q.add(new Pair(r, c - 1 , t + 1));
                        grid[r][c - 1] = 2;
                    }
                    
                    
                    
                    
                }
                
                for(int i = 0; i < m ; i++) {
                    for(int j = 0 ; j < n ; j++) {
                        if(grid[i][j] == 1) {
                            return -1;
                        }
                    }
                }
                
                return ans;
          }
        }
    }
}        