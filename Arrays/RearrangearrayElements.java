public class RearrangearrayElements {
//     public static void main(String[] args) {
        
//     }public static int [] rearrangeArray(int [] nums){
//         int l = nums.length;
//         int posArray []= new int[l/2];
//         int negArray []= new int [l/2];

//         int posIndex = 0; int negIndex =0;
//         for(int i =0;i<l;i++){
//             if(nums[i]<0){
//                 negArray[negIndex++]=nums[i];
            
//             }else if(nums[i]>0){
//                 posArray[posIndex++] = nums[i];
//             }
//         }
//         for(int i=0;i<l;i++){
//             if(i%2==0) nums[i]=posArray[i/2];
//             else nums[i]=negArray[i/2];
//         }
//         return nums;

//     }
// }


class Solution {
    public int[] rearrangeArray(int[] a) {
        int n=a.length;
        int []ans=new int[n];
       int posIndex=0,negIndex=1;
       for(int i=0;i<n;i++){
           if(a[i]>0){
               ans[posIndex]=a[i];
               posIndex+=2;
           }
           else{
               ans[negIndex]=a[i];
               negIndex+=2;
           }
       }
       return ans;

    }
}