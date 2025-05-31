public class checkifIthbitsetOrNot {

    public static void main(String[] args) {
        int i =1;
        int number = 10;

        if(checkifIthBitSet(number, i)){
            System.out.println("The " + i + "th bit is set in the number " + number);
        } else {
            System.out.println("The " + i + "th bit is not set in the number " + number);
        }

    }public static boolean checkifIthBitSet(int number , int i ){
        return (number & (1<<i))!=0;
    }
}