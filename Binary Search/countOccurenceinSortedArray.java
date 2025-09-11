import java.util.Scanner;

public class countOccurenceinSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        for(int i =0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        int start =0;
        int occ =-1;
        int end =0;
        int target =sc.nextInt();
        while(start<=end){
            int mid=(end-start)+ end/2;
            if(arr[mid]==target){
                occ++;
            }else if(arr[mid])
        }
    }
}
