public class MinimumDayatomakeMBouquets {
    public static void main(String[] args) {
        
        
    } public int minDays(int[] bloomDay, int m, int k) {
        int high = 0;
        for(int i = 0 ; i<bloomDay.length; i++){
            high = Math.max(high, bloomDay[i]);
        }
        int low = 0;
        int ans = -1;
        while(low <= high){
             
            int mid = low + (high - low)/2;
            if(getCount(bloomDay,m , k, mid)>=m){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid+1;
            }







        }

         return ans;

    }private int getCount(int [] bloomDay , int m , int k, int mid){

        int bouqetCount =0;
        int consecutiveCount = 0;
        for(int i = 0 ; i<bloomDay.length; i++){
              if(bloomDay[i]>=mid){
                consecutiveCount++;
              }else{
                consecutiveCount=0;
              }
              if(consecutiveCount == k){
                bouqetCount++;


              }

        }
         return bouqetCount;


    }
            
    }

