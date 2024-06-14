/**
 * SumofNNaturalNumbers
 */
public class SumofNNaturalNumbers {

    public static void main(String[] args) {
        
    }public int Sum(int N){
        if(N==1){
            return 1;
        }

        int temp = Sum(N-1);
        return temp +N; 
    }
}