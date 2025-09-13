public class AgressiveCows {
    public static void main(String[] args) {
        
    }public static int agressiveCow(int [] stalls , int cows){
        Arrays.sort(stalls);
        int start = 0;
        int max = Integer.MIN_VALUE;
        for(int i =0 ; i<stalls.length;i++){
            if(stalls[i]>max){
                max = stalls[i];
            }
        }
        int end = max;
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(isPossible(stalls, cows, mid)){
                ans = mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;


    }public static boolean isPossible(int [] stalls, int cows, int mid){
        int cowCount =1;
        int lastPos = stalls[0];
        for(int i =0 ; i < stalls.length ; i++){
            if(stalls[i]- lastPos >= mid){
                cowCount++;
                if(cowCount == cows){
                    return true;
                }
                lastPos = stalls[i];
            }       

            return cowCount>=cows;
        }
    }
}

