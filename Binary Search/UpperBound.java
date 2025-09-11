// public class UpperBound {
//     public static void main(String[] args) {
        
//     }public class int findUpperBound(int arr [], int k){
//         int start =0;
//         int end = arr.length-1;
//         int ans = 0;
//         while(start<end){
//             int mid = start+ (end-start)/2;

//             if(arr[mid]==k){
//                 return mid;
//             }else if(arr[mid]<k){
//                 start = mid+1;
//             }else{
//                 end = mid-1;
//                 ans = end;
//             }

//         }
//         return ans ;
//     } 
//     // for highbound , return arr[mid]>k

// }
// the last index of the target element

import java.util.Scanner;

public class UpperBound {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int [n];
        for(int i =0; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        int target =0;
        int start =0 ;
        int ans =-1;
        int end =0;
        while(start<=end){
            int mid = (end-start)+ end/2;


            if(mid==target){
                ans = mid;
            }


            if(arr[mid]<target){
                start = mid-1;
            }else{
                end = mid-1;
                ans = mid;

            }
        }
        return ans;
    }
}