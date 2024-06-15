public class Pow {
    public static void main(String[] args) {
        
    } public double myPow(double x, int n) {
        if(n==1){
            return x;
        }
        int temp = myPow(x, n/2);

        if(n%2==0){
            return temp*temp;
        }else{
            return temp*temp*x;
        }

        return -1;

    }
} 
}
