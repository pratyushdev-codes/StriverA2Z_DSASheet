public class capacitytoShipDpackages {
    public static void main(String[] args) {
        
    }public int calculate(int [] weights, int D, int mid , int cap){
        int load =0;
        int days = 1;   

        for(int i =0 ; i < weights.length ; i++){
             if(load+ weights[i]>cap){
                // shift to next day as it can be loaded on the belt for now 
                days++;
                load = weights[i];

             }else{
                load+= weights[i];
             }
        }
        return days;
    }public int findMin(int weights  [] , int D){
        int max = Integer.MIN_VALUE;
        int high = 0;

        int low =0;
        for(int i =0 ; i < weights.length; i++){
             low = weights[i];
             high = Math.max( high, max);
        }
        // complete the binary Search function
    }
}
