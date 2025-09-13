import java.util.Scanner;

public class nthRootofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }public static int func(int mid , int n , int m){
        long ans =1;
        for(int i =0 ; i<= n ;i++){
            ans = ans *mid;
            if(ans>n) return 2;
        }
        if(ans==m){
            return 0;
        }
    }public static int nthRoot(int n , int m){
        int low =1, high =m;

        while(low<=high){
            int mid = (low+high)/2;
            int midN = func(mid, n,m);
            if(midN==1){
                return mid;
            }else if (midN==0){
                low = mid+1;
            }else{
                high = mid -1;
            }
        }
        return -1;
    }
}
