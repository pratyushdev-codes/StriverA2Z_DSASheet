public class SmallestDivisor {
    public static void main(String[] args) {
int nums []= {1,2,7,9};
int threshold = 9;

                int ans =    smallestDivisor(nums , threshold);
                System.out.println(ans);
        
    }public static int smallestDivisor(int [] nums , int threshold){
        int max = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }


        int start = 0; int end = max;

        while(start<=end){
            int mid = start+end/2;

          
            if(findDivisor(nums, mid)<=threshold){
                end= mid-1;
            }else{
                start = mid+1;
            }
return start;
        }
    
    
    }private static int findDivisor(int [] nums , int div){
        int sum =0;

        for(int i =0; i<nums.length;i++){
            sum += Math.ceil((double)(nums[i])/(double)(div));
           
        }
        return sum;

    }
}
