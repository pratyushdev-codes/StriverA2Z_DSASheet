public class minNotomakeMbouqets {

    public static void main(String[] args) {
        
    }public int findMin(int [] bloomDay , int m , int K){
        int max= Integer.MIN_VALUE;
        for(int i =0 ; i< bloomDay.length ; i++){
            max = Math.max(max, bloomDay[i]);
        }
        int end = max;
        int start = 1;
        int minDay=0;
        while(start<= end){
            int mid = (start+ end)/2;

           if(canMakeBouquet(bloomDay, m, K, mid)>=m){
            minDay = mid;
            end = mid-1;
           }else{
            start = mid+1;
           }
        }
        return minDay;
    }
    
    public int canMakeBouquet(int [] bloomDay , int m , int K, int mid ){
        int bouqetCount =0;
        int concecutiveCount =0;

        for(int i =0 ; i< bloomDay.length ; i++){
  
        if(bloomDay[i]<mid){
                // it will take more days for the flower to boom
                concecutiveCount++;

        }else{
            concecutiveCount=0;
        }
       if(concecutiveCount==K){
        // now the concecutive Count has been achieved and we can proceed with one bouquet\
        bouqetCount++;
        concecutiveCount=0;

       }
    }
        return bouqetCount;
}
}