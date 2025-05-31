class ParityII {
    public static void main(String[] args) {

        int arr[] = {4,2,5,7};
        int[] ans = sortArrayByParityII(arr);
        for (int num : ans) {
            System.out.print(num + " ");
        }

    } public static int[] sortArrayByParityII(int[] nums) {
       int evenIndex =0;
       int oddIndex=1;
       for(int i = 0 ; i< nums.length ; i ++){
        if(i % 2 == 0){
            nums[evenIndex] = i;
            evenIndex+=2;
       }
        if(i%2!=0){
            nums[oddIndex] = i;
            oddIndex+=2;
        }
       return nums;
    }
}
