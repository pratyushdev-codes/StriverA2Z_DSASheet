/**
 * MoveZeros
 */
public class MoveZeros {

    public static void main(String[] args) {
        
    }public void moveZeros(int arr []){
        int lastZero= 0;


        int n = arr.length;
        for(int i =0;i<n;i++){
            if(arr[i]!=0){

                int temp = arr[i];
                arr[i]= arr[lastZero];
                arr[lastZero] = temp;
               lastZero++;
            }
        }
    }
}