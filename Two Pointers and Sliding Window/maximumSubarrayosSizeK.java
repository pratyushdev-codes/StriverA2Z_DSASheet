public class maximumSubarrayosSizeK {

    public static void main(String[] args) {
        int arr [] = {100, 200, 300, 400};
        int k =2;

        // we have a fixed size sliding window of size k
        int maxSum = Integer.MIN_VALUE;
        int i =0 , j =0 , sum =0 ;
        int n = arr.length;
        while(j<n){

            sum+= arr[j];
            if(j-i+1<k){
                j++;
            }else if (i-k+1==k){
                maxSum = Math.max(maxSum , sum);
                sum -=arr[i];

                i++;
                j++;
            }
        }
      
System.out.println(maxSum);;
         
        }
    }