public class rangeSumQuert {
        int [] pf;
    public static void main(String[] args) {


        
    }public NumArray(int [] nums){
        int n = nums.length;
        pf= new int[n];
        pf[0] = nums[0];
        for(int i = 0 ; i< n ; i++){
            pf[i] = pf[i-1]+ nums[i];
        }
    }

    }
}