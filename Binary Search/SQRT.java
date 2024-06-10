class Solution {
    public int mySqrt(int x) {
        // For special cases when x is 0 or 1, return x.
       if(x==0  || x==1){
            return x;
        }
        int start = 1;
        int end = x;
        int mid =-1;

        while (start<=end) {
           mid = start+(end-start)/2;
           if(mid*mid==x){
            return mid;
           } else if((long)mid*mid<x){
                start= mid+1;
           }else{
               end = mid-1;
           }
        }
           // we round down the value of "end" to the nearest integer to get the correct square root.
           return Math.round(end);
    }
    
}
