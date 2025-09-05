import java.util.Scanner;

public class GCDHCF {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();

    }public static int findGCD(int a , int b){
        if(b==0){
            return a;
        }

        return findGCD(b, a%b);
    }
}