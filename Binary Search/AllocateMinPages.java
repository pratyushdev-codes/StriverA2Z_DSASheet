public class AllocateMinPages {
    public static void main(String[] args) {
        int arr [] = {12, 34, 67, 90};
        int m = 2;
        int n =4;



    }public static int checkCanAllocate(int arr [], int pages){

        int pagesSum =0;
        int studentCount =1;


        for(int i = 0 ; i< arr.length ; i++){

            if(pagesSum + arr[i]>pages){
                pagesSum += arr[i];

            }else{
                studentCount++;
                pagesSum= arr[i];
            }
        }
        return studentCount;
    }public static int findAllocation(int arr[], int m , int n){
                int max = Integer.MIN_VALUE;
                int sum = 0;
        for(int i =0 ; i < arr.length ; i++){
            max= Math.max(max, arr[i]);
            sum+= arr[i];
        }
        int low= max;
        int high = sum;

        while(low<high){
            int mid = (low+high)/2;
            int studentCount = checkCanAllocate(arr, mid);

            if(studentCount>mid){
                low = mid+1;
            }else{
                high = mid-1;
            }
        
        }
        return low; // we need to allocate min pages 
    }
}
