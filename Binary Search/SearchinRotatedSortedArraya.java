public class SearchinRotatedSortedArraya {
    public static void main(String[] args) {
        
    }  public int search(int[]arr, int target) {

        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+end/2;
            if(target==mid){
                return mid;
            }else if(arr[mid]<=target){
                if(arr[start]<=target && target<=arr[mid]){
                    //left part of the array is sorted
                    //eliminate the right half

                    end= mid-1;
                    
                }else{
                    start=mid+1;
                }
                }else{
                    if(arr[mid]<=target && target<=arr[end]){
                        //right half is sorted
                        //eliminate the right half
                         start=mid+1;
                        


                    }else{
                        end = mid-1;
                    }
                }
               
            }
            return -1;
        }







    }

