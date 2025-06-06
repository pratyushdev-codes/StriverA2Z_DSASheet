public class SearchInsertPos {
   public static void main(String[] args) {
    int arr [] = {19, 94, 332,343};
    int k = 19;
    System.out.println(searchInsert(arr, k));
    
   } public static int searchInsert(int arr[], int k) {
       int  start =0;
       int end = arr.length;


       while(start<end){
        int mid = start+ (end-start)/2;

        if(mid==k){
            return mid;
        }else if(mid<k){
            start = mid+1;
        }else{
            end = mid-1;
        }
            
       }
         return start;  
    }

}



