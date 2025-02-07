public class LowerBound {

    public static void main(String[] args) {
        
    } public static int findFloor(int[] arr, int k) {
                int start =0;
                int end = arr.length-1;
                int ans = 0;

                while (start<=end) {
                    int mid = start+ (end-start)/2;
                    //implement lower bound

                    //  find the index (0-based) of the largest element in arr[] that is less than or equal to k. This element is called the "floor" of k. If such an element does not exist, return -1.

                        if(arr[mid]==k){
                            return mid;

                        }

                        if(arr[mid]<k){
                            start = mid+1;
                            ans=mid;

                        }else{
                            end = mid-1;
                        }


// for lower bound return arr[mid]<k ,. i.e store it your ans variable
                }
                return ans;

            }


        }

